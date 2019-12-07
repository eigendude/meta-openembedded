inherit setuptools3
require python-protobuf.inc

FILESEXTRAPATHS_prepend := "${THISDIR}/python-protobuf:"

DEPENDS += "protobuf"
DISTUTILS_BUILD_ARGS += "--cpp_implementation --compile_static_extension"
DISTUTILS_INSTALL_ARGS += "--cpp_implementation"

do_compile_prepend_class-native () {
    export KOKORO_BUILD_NUMBER="1"
}
