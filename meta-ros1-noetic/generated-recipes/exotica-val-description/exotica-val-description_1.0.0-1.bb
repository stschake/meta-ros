# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "val_description version including our updated meshes for unit testing and visualisation. Based on the OpenHumanoids fork of the val_description package by NASA JSC. The most current version of the original package can be found at http://gitlab.com/nasa-jsc-robotics/val_description"
AUTHOR = "Wolfgang Merkt <wolfgang.merkt@ed.ac.uk>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "NASA-1.3"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=66432e857bf21180c0bbef7cde4f8a21"

ROS_CN = "exotica_val_description"
ROS_BPN = "exotica_val_description"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/wxmerkt/exotica_val_description-release/archive/release/noetic/exotica_val_description/1.0.0-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/exotica_val_description"
SRC_URI = "git://github.com/wxmerkt/exotica_val_description-release;${ROS_BRANCH};protocol=https"
SRCREV = "8a39ce0e22e247534f4a1b555b958700f32383ed"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}