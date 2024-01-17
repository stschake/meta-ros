# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_iron
inherit ros_superflore_generated

DESCRIPTION = "Messages around the UR Dashboard server."
AUTHOR = "Felix Exner <exner@fzi.de>"
ROS_AUTHOR = "Denis Stogl <denis@stoglrobotics.de>"
HOMEPAGE = "https://github.com/UniversalRobots/Universal_Robots_ROS2_Driver/issues"
SECTION = "devel"
LICENSE = "BSD-3-Clause"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=4633480cdd27d7906aaf3ef4b72014b2"

ROS_CN = "ur_robot_driver"
ROS_BPN = "ur_dashboard_msgs"

ROS_BUILD_DEPENDS = " \
    action-msgs \
    rosidl-default-generators \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    action-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    action-msgs \
    rosidl-default-runtime \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/Universal_Robots_ROS2_Driver-release/archive/release/iron/ur_dashboard_msgs/2.3.5-1.tar.gz
ROS_BRANCH ?= "branch=release/iron/ur_dashboard_msgs"
SRC_URI = "git://github.com/ros2-gbp/Universal_Robots_ROS2_Driver-release;${ROS_BRANCH};protocol=https"
SRCREV = "c686e1dec1cdbb91fa3ee3fe9bc0a980e252b383"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}