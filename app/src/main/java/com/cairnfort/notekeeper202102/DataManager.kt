package com.cairnfort.notekeeper202102

//class DataManager {
// object => means it becomes a singleton, created one and available globally throughout the app
object DataManager {

    val courses = HashMap<String, CourseInfo>()

    val notes = ArrayList<NoteInfo>()

    // Initializer block
    // Similar to a constructor in Java - it gets called after the class is created
    // It DOES NOT accept parameters

    init {

        initializeCourses()
        initializeNotes()
    }

    private fun initializeNotes() {
       // TODO("Not yet implemented")
        var course = CourseInfo("Kotlin", "Integers")

        var note = NoteInfo(course,"My first Kotlin note","Kotlin is shorter than java 1")
        var note2 = NoteInfo(course,"My second Kotlin note","Kotlin is shorter than java 2")
        var note3 = NoteInfo(course,"My third Kotlin note","Kotlin is shorter than java 3")

        notes.add(note)
        notes.add(note2)
        notes.add(note3)

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