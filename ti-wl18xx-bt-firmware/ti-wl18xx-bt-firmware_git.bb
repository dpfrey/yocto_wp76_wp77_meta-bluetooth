DESCRIPTION = "Texas Instruments wl18xx Bluetooth script"
# TODO: Is there a proper way to refer to this license?
LICENSE = "TI-BSP"
LIC_FILES_CHKSUM = "file://LICENCE;md5=1c9961176d6529283e0d0c983be41b45"
PR = "r0"
PV = "11.8.32+git${SRCPV}"
SRCREV = "45897a170bc30afb841b1491642e774f0c89b584"
BRANCH = "master"
SRC_URI = "git://git.ti.com/wilink8-bt/ti-bt-firmware.git;protocol=git;branch=${BRANCH}"
S = "${WORKDIR}/git"
TI_FW_DIR = "lib/firmware/ti-connectivity"
PACKAGE_ARCH = "all"

do_compile[noexec] = "1"

do_install() {
    install -d ${D}/${TI_FW_DIR}
    install -m 0644 ${S}/TIInit_11.8.32.bts ${D}/${TI_FW_DIR}
}

FILES_${PN} = "/${TI_FW_DIR}/*"
