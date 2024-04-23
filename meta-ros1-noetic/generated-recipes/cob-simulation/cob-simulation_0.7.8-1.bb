# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_noetic
inherit ros_superflore_generated

DESCRIPTION = "The cob_simulation stack includes packages to work with Care-O-bot within simulation environments, e.g. gazebo."
AUTHOR = "Richard Bormann <richard.bormann@ipa.fraunhofer.de>"
HOMEPAGE = "http://ros.org/wiki/cob_simulation"
SECTION = "devel"
# Original license in package.xml, joined with "&" when multiple license tags were used:
#         "Apache 2.0"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

ROS_CN = "cob_simulation"
ROS_BPN = "cob_simulation"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    catkin-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    cob-bringup-sim \
    cob-gazebo \
    cob-gazebo-objects \
    cob-gazebo-tools \
    cob-gazebo-worlds \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ipa320/cob_simulation-release/archive/release/noetic/cob_simulation/0.7.8-1.tar.gz
ROS_BRANCH ?= "branch=release/noetic/cob_simulation"
SRC_URI = "git://github.com/ipa320/cob_simulation-release;${ROS_BRANCH};protocol=https"
SRCREV = "094b0be2a0a02e672823553f86c06a9925e4ad27"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "catkin"

inherit ros_${ROS_BUILD_TYPE}