Boilerplate project
===============
This project is a ready-to use boilerplate for "It's not a bug, It's a feature" Java course.

####Already configured parts

* Travis-CI configuration file
* .gitignore file
* build.gradle (already contains all needed imports)
* empty package in src folder (`school.lemon.changerequest.java`)

#### Travis-CI configuration
* Oracle JDK 8
* Install step: `gradlew clean assemble`
* Check step: `gradlew check`

#### .gitignore
Already configured to ignore most of unwonted stuff:
* eclipse ignores
* IDEA ignores
* Java and Groovy ignores
* gradle and maven ignores
* etc.

#### build.gradle
* group is `school.lemon.changerequest.java`
* applied module from [gradle_common project]:
  * commonModule
  * javaModule
  * testModule
  * idea
  * eclipse

#### How-to use
  
  
[gradle_common project]: https://github.com/ChangeRequest/gradle_common

