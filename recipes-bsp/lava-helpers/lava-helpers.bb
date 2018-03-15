SUMMARY = "LAVA helper scripts"
LICENSE = "GPL-2.0"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/GPL-2.0;md5=801f80980d171dd6425610833a22dbe6"
SRC_URI = "file://lava-test-case"

S = "${WORKDIR}"

do_install() {
	mkdir -p ${D}/usr/bin
        install -m 0755 ${WORKDIR}/lava-test-case ${D}/usr/bin/lava-test-case
}

inherit allarch

FILES_${PN} += " /usr/bin/lava-test-case "
