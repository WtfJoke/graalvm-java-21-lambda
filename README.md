# GraalVM Java 21 Lambda

Inspired by the cold start performance of GraalVM Java 17 on AWS Lambda from https://maxday.github.io/lambda-perf/ (see https://github.com/maxday/lambda-perf),
I wanted to test the cold start performance of a GraalVM Java 21 Native Image on AWS Lambda.

There seems to be currently no example to do this, that's why I created this PoC.

# Howto
(Assuming you're on a linux machine)
1. `mvn install -P native`
2. Upload `function.zip` to a newly created lambda

# Inspiration / Shoutouts

Thanks to @marksailes / @msailes for creating https://www.graalvmonlambda.com/ (https://github.com/marksailes/graalvm-on-lambda) and related repositories (https://github.com/aws-samples/serverless-graalvm-demo, https://github.com/marksailes/al2-graalvm)
