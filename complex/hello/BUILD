load("@io_bazel_rules_kotlin//kotlin:jvm.bzl", "kt_jvm_binary")

java_binary(
    name = "hello",
    srcs = glob(["*.java"]),
    main_class = "HelloWorld",
)

kt_jvm_binary(
	name = "hello2",
	srcs = glob(["*.kt"]),
	main_class = "HelloWorld2",
	deps = [ "//hello/lib" ],
)
