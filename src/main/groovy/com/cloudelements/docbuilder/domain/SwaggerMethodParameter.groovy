package com.cloudelements.docbuilder.domain

import groovy.transform.ToString

/**
 * TODO - JJW
 *
 * @version %I%, %G%
 * @author jjwyse
 */
@ToString
abstract class SwaggerMethodParameter
{
    String description
    String parameterType
}
