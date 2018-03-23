BT_CFG := "${THISDIR}/bluetooth.cfg"

do_configure_append() {
    # TODO: Is there a better way to express the config location?
    # TODO: Is there a better option that appending to the file? Calling patch seems like it would
    #       be worse because it would fail to apply if the .config changed considerably.
    cat ${BT_CFG} >> ${WORKDIR}/build/.config
    oe_runmake_call -C ${S} ARCH=${ARCH} ${KERNEL_EXTRA_ARGS} oldconfig
}
