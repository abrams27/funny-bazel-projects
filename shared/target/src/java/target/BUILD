load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "target1",
    srcs = ["File1.java"],
    visibility = ["//visibility:public"],
    deps = [
        "//libA/src/java/libA:libA1",
        "//impl1/src/java/impl",
    ],
)

java_library(
    name = "target2",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "//libA/src/java/libA:libA2",
        "//impl2/src/java/impl",
    ],
)
