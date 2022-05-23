load("@rules_java//java:defs.bzl", "java_library")

java_library(
    name = "target1",
    srcs = ["File1.java"],
    visibility = ["//visibility:public"],
    deps = [
        "//impl1/src/java/impl",
        "//libA/src/java/libA:libA1",
    ],
)

java_library(
    name = "target2",
    srcs = glob(["*.java"]),
    visibility = ["//visibility:public"],
    deps = [
        "//impl2/src/java/impl",
        "//libA/src/java/libA:libA2",
    ],
)
