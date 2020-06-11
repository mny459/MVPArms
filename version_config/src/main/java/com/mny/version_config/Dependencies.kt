package com.mny.version_config

@Suppress("SpellCheckingInspection")
object Dependencies {

    object BuildConfig {
        const val compileSdkVersion = 29
        const val buildToolsVersion = "29.0.3"
        const val minSdkVersion = 23
        const val targetSdkVersion = 29
        const val versionCode = 1
        const val versionName = "1.0"
    }

    object AndroidX {
        const val appcompat = "androidx.appcompat:appcompat:1.3.0-alpha01"
        const val recyclerView = "androidx.recyclerview:recyclerview:1.2.0-alpha03"
        const val coreKtx = "androidx.core:core-ktx:1.2.0"
        const val activityKtx = "androidx.activity:activity-ktx:1.2.0-alpha04"
        const val constraintlayout = "androidx.constraintlayout:constraintlayout:2.0.0-beta6"
        const val cardview = "androidx.cardview:cardview:1.0.0"
        const val multidex = "androidx.multidex:multidex:2.0.0"
        const val legacy = "androidx.legacy:legacy-support-v4:1.0.0"
        const val viewpager = "androidx.viewpager:viewpager:1.0.0"
        const val viewpager2 = "androidx.viewpager2:viewpager2:1.0.0"


        object Fragment {
            private const val fragment_version = "1.3.0-alpha05"
            const val fragment = "androidx.fragment:fragment:$fragment_version"
            const val fragmentKtx = "androidx.fragment:fragment-ktx:$fragment_version"
            const val fragmentTesting = "androidx.fragment:fragment-testing:$fragment_version"
        }


        object Lifecycle {
            private const val lifecycle_version = "2.2.0"
            const val lifecycleRuntime = "androidx.lifecycle:lifecycle-runtime:$lifecycle_version"

            const val viewModel = "androidx.lifecycle:lifecycle-viewmodel:$lifecycle_version"
            const val viewModelKtx = "androidx.lifecycle:lifecycle-viewmodel-ktx:$lifecycle_version"

            const val liveData = "androidx.lifecycle:lifecycle-livedata:$lifecycle_version"
            const val liveDataKtx = "androidx.lifecycle:lifecycle-livedata-ktx:$lifecycle_version"

            const val viewModelSavedState = "androidx.lifecycle:lifecycle-viewmodel-savedstate:$lifecycle_version"
            const val commonJava8 = "androidx.lifecycle:lifecycle-common-java8:$lifecycle_version"
            const val service = "androidx.lifecycle:lifecycle-service:$lifecycle_version"

            @Deprecated("lifecycle-extensions 已弃用,不要使用 ViewModelProviders.of 的方式")
            const val extensions = "androidx.lifecycle:lifecycle-extensions:$lifecycle_version"
        }


        object Navigation {
            private const val nav_version = "2.3.0-beta01"

            // 无需直接引用
            const val runtime = "androidx.navigation:navigation-runtime:$nav_version"

            const val fragment = "androidx.navigation:navigation-fragment:$nav_version"
            const val fragmentKtx = "androidx.navigation:navigation-fragment-ktx:$nav_version"

            const val ui = "androidx.navigation:navigation-ui:$nav_version"
            const val uiKtx = "androidx.navigation:navigation-ui-ktx:$nav_version"

            // Dynamic Feature Module Support
            const val dynamic = "androidx.navigation:navigation-dynamic-features-fragment:$nav_version"

            // Testing Navigation
            const val testing = "androidx.navigation:navigation-testing:$nav_version"
        }


        object Room {
            private const val room_version = "2.2.5"
            const val roomRuntime = "androidx.room:room-runtime:$room_version"

            // for java use annotationProcessor , for kotlin use kapt
            const val roomCompiler = "androidx.room:room-compiler:$room_version"

            // optional - Kotlin Extensions and Coroutines support for Room
            const val roomKtx = "androidx.room:room-ktx:$room_version"

            // optional - RxJava support for Room
            const val roomrxjava2 = "androidx.room:room-rxjava2:$room_version"

            // optional - Guava support for Room, including Optional and ListenableFuture
            const val roomGuava = "androidx.room:room-guava:$room_version"

            // Test helpers
            const val roomTesting = "androidx.room:room-testing:$room_version"
        }

        object Paging {
            private const val paging_version = "2.1.2"
            const val pagingRuntime = "androidx.paging:paging-runtime:$paging_version"
            const val pagingRuntimeKtx = "androidx.paging:paging-runtime-ktx:$paging_version"

            // optional - RxJava support
            const val rxjava2 = "androidx.paging:paging-rxjava2:$paging_version"
            const val rxjava2Ktx = "androidx.paging:paging-rxjava2-ktx:$paging_version"

            // alternatively - without Android dependencies for testing
            const val testingCommon = "androidx.paging:paging-common:$paging_version"
            const val testingCommonKtx = "androidx.paging:paging-common-ktx:$paging_version"
        }
    }

    object Google {
        const val material = "com.google.android.material:material:1.2.0-alpha05"
        const val gson = "com.google.code.gson:gson:2.8.6"
    }

    object Testing {
        const val jUnit = "junit:junit:4.12"
        const val androidJunit = "androidx.test.ext:junit:1.1.1"
        const val androidRunner = "androidx.test:runner:1.2.0"
        const val espresso = "androidx.test.espresso:espresso-core:3.2.0"
    }

    object ThirdParty {
        const val materialiconlib = "net.steamcrafted:materialiconlib:1.1.5"
        const val permission = "com.yanzhenjie.permission:x:2.0.1"

        object Glide {
            private const val glide_version = "4.11.0"
            const val glide = "com.github.bumptech.glide:glide:$glide_version"
            const val compiler = "com.github.bumptech.glide:compiler:$glide_version"
        }

        const val roundedImageView = "com.makeramen:roundedimageview:2.3.0"

    }
}