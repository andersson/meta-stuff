# meta-stuff for generating bootrr ramdisk

## Initialize workspace

    $ mkdir oe-rpb
    $ cd oe-rpb
    $ repo init -u https://github.com/96boards/oe-rpb-manifest.git -b qcom/rocko
    $ repo sync
    $ DISTRO=rpb MACHINE=dragonboard-410c . setup-environment db410c

## Add meta-stuff layer

Add the path to your cloned `meta-stuff` under BASELAYERS in `conf/bblayers.conf`.

## Build

In order to generate an image, run:

    bitbake initramfs-bootrr-image

This will, after some time, produce the following image.

    tmp-nodistro-glibc/deploy/images/dragonboard-410c/initramfs-bootrr-image-dragonboard-410c.cpio.gz

Use this as `--ramdisk` in mkbootimg and the bootrr scripts for the device will
automatically be executed as the board is booted.
