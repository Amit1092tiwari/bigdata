//Name of your project
name := "hello"

//The Version of your project
version := "1.0"

//Scala version required for the project
scalaVersion := "2.11.8"

//Add library dependencies here
libraryDependencies ++= Seq(
  "org.apache.spark" %% "spark-core" % "1.5.2" % "provided",
  "com.holdenkarau" %% "spark-testing-base" % "1.5.2_0.6.0" % "test"
  //"org.scalatest" % "scalatest_2.11" % "3.0.1" % "test",
 )
