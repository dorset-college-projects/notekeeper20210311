package com.cairnfort.notekeeper202102

class DataManager {

    val courses = HashMap<String, CourseInfo>()

    val notes = ArrayList<NoteInfo>()

    // Initializer block
    // Similar to a constructor in Java - it gets called after the class is created
    // It DOES NOT accept parameters

    init {

        initializeCourses()
    }

    private fun initializeCourses() {
      //  TODO("Not yet implemented")

        var course = CourseInfo("Kotlin", "Integers")

        courses.set(course.courseId, course)

        // Alternative method : using named parameters
        course = CourseInfo(courseId="Android", title="Intents")
        courses.set(course.courseId, course)

        // Alternative method : using named parameters in a different order
        course = CourseInfo(title="Classes", courseId="Java")
        courses.set(course.courseId, course)

        course = CourseInfo("C#", "Collections")
        courses.set(course.courseId, course)


    }

}