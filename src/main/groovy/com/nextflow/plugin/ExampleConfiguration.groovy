package com.nextflow.plugin

import groovy.transform.PackageScope

@PackageScope
class ExampleConfiguration {

    final private int maxSize

    ExampleConfiguration(Map map){
        def config = map ?: Collections.emptyMap()
        maxSize = (config.maxSize ?: 1000) as int
    }

    int getMaxRandomSizeString(){
        maxSize
    }
}
