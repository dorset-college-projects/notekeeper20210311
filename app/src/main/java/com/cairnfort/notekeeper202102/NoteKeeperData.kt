package com.cairnfort.notekeeper202102

// Note that 'val' is for immutable properties (cannot be changed)
// var is for mutable properties (can be changed)
// Note Kotlin is doing all the work in the constructor: (getting, setting assign)

// modify by prefixing with data - so it's treated as a data object instead of a class with behaviour
data class CourseInfo(val courseId: String, val title: String) {
    override fun toString(): String {
        return title //super.toString()
    }
}

data class NoteInfo(var course: CourseInfo, var title: String, var text: String) {
    override fun toString(): String {
        return title
    }
}