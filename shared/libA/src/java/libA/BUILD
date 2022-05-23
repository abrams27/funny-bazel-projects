load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "libA1",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "//libB/src/java/libB:libB1"
    ],
)

java_library(
    name = "libA2",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "//libB/src/java/libB:libB2"
    ],
)
