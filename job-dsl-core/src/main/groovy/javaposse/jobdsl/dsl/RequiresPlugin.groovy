package javaposse.jobdsl.dsl

import java.lang.annotation.Documented
import java.lang.annotation.ElementType
import java.lang.annotation.Target

/**
 * Indicates that a plugin must be installed to use the features provided by the annotated DSL method. A minimum
 * version can be specified as a lower bound for the version of the required plugin.
 */
@Target([ElementType.METHOD])
@Documented
@interface RequiresPlugin {
    /**
     * The Plugin ID or short name of the required plugin.
     */
    String id()

    /**
     * The least acceptable version of the required plugin. Optional, any version will be accepted if none is given.
     */
    String minimumVersion() default ''
}
