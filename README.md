Boilerplate project
===============
This project is a ready-to use boilerplate for "It's not a bug, It's a feature" Java course.

#### How-to use

1. `git clone https://github.com/ChangeRequest/boilerplate-project.git name_of_new_project`
2. `git remote remove origin`
3. `git remote add origin https://github.com/new_repo/name_of_new_project.git`
4. Update `README.MD` to match newly created repository.
5. Update Author name in `LICENSE` (if needed)
6. Continue working in your new ready-to-use repository.

####Already configured parts

* Travis-CI configuration file
* .gitignore file
* build.gradle (already contains all needed imports)
* License file with `Apache License Version 2.0`
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


  
[gradle_common project]: https://github.com/ChangeRequest/gradle_common

