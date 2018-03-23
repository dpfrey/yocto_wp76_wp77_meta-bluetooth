# Bluetooth Layer for WP76xx/WP77xx

Author: David Frey <dfrey@sierrawireless.com>

The goal of this layer is to provide everything necessary for Bluetooth on a mangOH board with a
WP76xx or WP77xx module installed. Note that I'm still pretty new to yocto, so if you see something
questionable in this repository, please let me know and I will try to correct it.

## What this layer provides
* Kernel config options required to build bluetooth and drivers as modules
* Builds the bluez5 recipe

## What is missing
* Update of the root filesystem to install the firmware blob for the TI WiFi/BT IoT card.

## How to use this layer
First, clone this layer into `meta-bluetooth` under the root directory of the WP76/WP77 yocto tree.
The following change needs to be applied to `meta-swi/build.sh` in order to enable the layer.
```
diff --git a/build.sh b/build.sh
index 56853bc..8b40c82 100755
--- a/build.sh
+++ b/build.sh
@@ -261,6 +261,8 @@ case $MACH in
         ;;
 esac
 
+enable_layer "meta-bluetooth"  "$SWI/../meta-bluetooth"
+
 # Enable the meta-swi layer
 enable_layer "meta-swi/common" "$SWI/common"
```

Once the patch is applied, the image can be built as usual using `make image_bin`.
