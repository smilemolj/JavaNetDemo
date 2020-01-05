package com.smilemolj.javanetdemo.reflect

@Target(AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS)
@Retention(AnnotationRetention.RUNTIME)
annotation class Pro(val className: String, val methodName: String)