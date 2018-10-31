package com.squareup.kotlinpoet

import java.lang.reflect.Type
import javax.lang.model.element.ExecutableElement
import javax.lang.model.type.DeclaredType
import javax.lang.model.util.Types
import kotlin.reflect.KClass

@Target(AnnotationTarget.TYPE)
@DslMarker
annotation class KotlinPoetDSL


private typealias TypeSpecBlock = (@KotlinPoetDSL TypeSpec.Builder).() -> Unit
private typealias PropertySpecBlock = (@KotlinPoetDSL PropertySpec.Builder).() -> Unit
private typealias FunSpecBlock = (@KotlinPoetDSL FunSpec.Builder).() -> Unit
private typealias FileSpecBlock = (@KotlinPoetDSL FileSpec.Builder).() -> Unit


/*
 * Shortcuts for FileSpec
 */

fun fileSpec(
  packageName: String,
  fileName: String,
  block: FileSpecBlock
) = FileSpec.builder(packageName, fileName).apply(block).build()

/*
 * Shortcuts for adding TypeSpec to FileSpec
 */

fun FileSpec.Builder.classSpec(
  name: String,
  block: TypeSpecBlock
): FileSpec.Builder =
  addType(TypeSpec.classBuilder(name).apply(block).build())

fun FileSpec.Builder.classSpec(
  className: ClassName,
  block: TypeSpecBlock
): FileSpec.Builder =
  addType(TypeSpec.classBuilder(className).apply(block).build())

fun FileSpec.Builder.expectClassSpec(
  name: String,
  block: TypeSpecBlock
): FileSpec.Builder =
  addType(TypeSpec.expectClassBuilder(name).apply(block).build())

fun FileSpec.Builder.expectClassSpec(
  className: ClassName,
  block: TypeSpecBlock
): FileSpec.Builder =
  addType(TypeSpec.expectClassBuilder(className).apply(block).build())

fun FileSpec.Builder.objectSpec(
  name: String,
  block: TypeSpecBlock
): FileSpec.Builder =
  addType(TypeSpec.objectBuilder(name).apply(block).build())

fun FileSpec.Builder.objectSpec(
  className: ClassName,
  block: TypeSpecBlock
): FileSpec.Builder =
  addType(TypeSpec.objectBuilder(className).apply(block).build())

fun FileSpec.Builder.interfaceSpec(
  name: String,
  block: TypeSpecBlock
): FileSpec.Builder =
  addType(TypeSpec.interfaceBuilder(name).apply(block).build())

fun FileSpec.Builder.interfaceSpec(
  className: ClassName,
  block: TypeSpecBlock
): FileSpec.Builder =
  addType(TypeSpec.interfaceBuilder(className).apply(block).build())

fun FileSpec.Builder.enumSpec(
  name: String,
  block: TypeSpecBlock
): FileSpec.Builder =
  addType(TypeSpec.enumBuilder(name).apply(block).build())

fun FileSpec.Builder.enumSpec(
  className: ClassName,
  block: TypeSpecBlock
): FileSpec.Builder =
  addType(TypeSpec.enumBuilder(className).apply(block).build())

fun FileSpec.Builder.annotationSpec(
  name: String,
  block: TypeSpecBlock
): FileSpec.Builder =
  addType(TypeSpec.annotationBuilder(name).apply(block).build())

fun FileSpec.Builder.annotationSpec(
  className: ClassName,
  block: TypeSpecBlock
): FileSpec.Builder =
  addType(TypeSpec.annotationBuilder(className).apply(block).build())


/*
 * Shortcuts for adding TypeSpec to TypeSpec
 */

fun TypeSpec.Builder.classSpec(
  name: String,
  block: TypeSpecBlock
): TypeSpec.Builder =
  addType(TypeSpec.classBuilder(name).apply(block).build())

fun TypeSpec.Builder.classSpec(
  className: ClassName,
  block: TypeSpecBlock
): TypeSpec.Builder =
  addType(TypeSpec.classBuilder(className).apply(block).build())

fun TypeSpec.Builder.expectClassSpec(
  name: String,
  block: TypeSpecBlock
): TypeSpec.Builder =
  addType(TypeSpec.expectClassBuilder(name).apply(block).build())

fun TypeSpec.Builder.cxpectClassSpec(
  className: ClassName,
  block: TypeSpecBlock
): TypeSpec.Builder =
  addType(TypeSpec.expectClassBuilder(className).apply(block).build())

fun TypeSpec.Builder.objectSpec(
  name: String,
  block: TypeSpecBlock
): TypeSpec.Builder =
  addType(TypeSpec.objectBuilder(name).apply(block).build())

fun TypeSpec.Builder.objectSpec(
  className: ClassName,
  block: TypeSpecBlock
): TypeSpec.Builder =
  addType(TypeSpec.objectBuilder(className).apply(block).build())

fun TypeSpec.Builder.interfaceSpec(
  name: String,
  block: TypeSpecBlock
): TypeSpec.Builder =
  addType(TypeSpec.interfaceBuilder(name).apply(block).build())

fun TypeSpec.Builder.interfaceSpec(
  className: ClassName,
  block: TypeSpecBlock
): TypeSpec.Builder =
  addType(TypeSpec.interfaceBuilder(className).apply(block).build())

fun TypeSpec.Builder.enumSpec(
  name: String,
  block: TypeSpecBlock
): TypeSpec.Builder =
  addType(TypeSpec.enumBuilder(name).apply(block).build())

fun TypeSpec.Builder.enumSpec(
  className: ClassName,
  block: TypeSpecBlock
): TypeSpec.Builder =
  addType(TypeSpec.enumBuilder(className).apply(block).build())

fun TypeSpec.Builder.annotationSpec(
  name: String,
  block: TypeSpecBlock
): TypeSpec.Builder =
  addType(TypeSpec.annotationBuilder(name).apply(block).build())

fun TypeSpec.Builder.annotationSpec(
  className: ClassName,
  block: TypeSpecBlock
): TypeSpec.Builder =
  addType(TypeSpec.annotationBuilder(className).apply(block).build())

/*
 * Shortcuts for adding PropertySpec to FileSpec
 */

fun FileSpec.Builder.propertySpec(
  name: String,
  type: TypeName,
  vararg modifiers: KModifier,
  block: PropertySpecBlock = {}
): FileSpec.Builder =
  addProperty(
    PropertySpec.builder(name, type, *modifiers)
      .apply(block).build()
  )

fun FileSpec.Builder.propertySpec(
  name: String,
  type: Type,
  vararg modifiers: KModifier,
  block: PropertySpecBlock = {}
): FileSpec.Builder =
  addProperty(
    PropertySpec.builder(name, type, *modifiers)
      .apply(block).build()
  )

fun FileSpec.Builder.propertySpec(
  name: String,
  type: KClass<*>,
  vararg modifiers: KModifier,
  block: PropertySpecBlock = {}
): FileSpec.Builder =
  addProperty(
    PropertySpec.builder(name, type, *modifiers)
      .apply(block).build()
  )

/*
 * Shortcuts for adding PropertySpec to TypeSpec
 */

fun TypeSpec.Builder.propertySpec(
  name: String,
  type: TypeName,
  vararg modifiers: KModifier,
  block: PropertySpecBlock = {}
): TypeSpec.Builder =
  addProperty(
    PropertySpec.builder(name, type, *modifiers)
      .apply(block).build()
  )

fun TypeSpec.Builder.propertySpec(
  name: String,
  type: Type,
  vararg modifiers: KModifier,
  block: PropertySpecBlock = {}
): TypeSpec.Builder =
  addProperty(
    PropertySpec.builder(name, type, *modifiers)
      .apply(block).build()
  )

fun TypeSpec.Builder.propertySpec(
  name: String,
  type: KClass<*>,
  vararg modifiers: KModifier,
  block: PropertySpecBlock = {}
): TypeSpec.Builder =
  addProperty(
    PropertySpec.builder(name, type, *modifiers)
      .apply(block).build()
  )

fun TypeSpec.Builder.varPropertySpec(
  name: String,
  type: TypeName,
  vararg modifiers: KModifier,
  block: PropertySpecBlock = {}
): TypeSpec.Builder =
  addProperty(
    PropertySpec.builder(name, type, *modifiers)
      .mutable(true)
      .apply(block).build()
  )

fun TypeSpec.Builder.varPropertySpec(
  name: String,
  type: Type,
  vararg modifiers: KModifier,
  block: PropertySpecBlock = {}
): TypeSpec.Builder =
  addProperty(
    PropertySpec.builder(name, type, *modifiers)
      .mutable(true)
      .apply(block).build()
  )

fun TypeSpec.Builder.varPropertySpec(
  name: String,
  type: KClass<*>,
  vararg modifiers: KModifier,
  block: PropertySpecBlock = {}
): TypeSpec.Builder =
  addProperty(
    PropertySpec.builder(name, type, *modifiers)
      .mutable(true)
      .apply(block).build()
  )

/*
 * Shortcuts for adding FunctionSpec to FileSpec
 */

fun FileSpec.Builder.funSpec(
  name: String,
  block: FunSpecBlock
): FileSpec.Builder =
  addFunction(FunSpec.builder(name).apply(block).build())

/*
 * Shortcuts for adding FunctionSpec to TypeSpec
 */

fun TypeSpec.Builder.funSpec(
  name: String,
  block: FunSpecBlock
): TypeSpec.Builder =
  addFunction(FunSpec.builder(name).apply(block).build())

fun TypeSpec.Builder.primaryConstructorSpec(
  block: FunSpecBlock
): TypeSpec.Builder =
  primaryConstructor(FunSpec.constructorBuilder().apply(block).build())

fun TypeSpec.Builder.nonPrimaryConstructorSpec(
  block: FunSpecBlock
): TypeSpec.Builder =
  addFunction(FunSpec.constructorBuilder().apply(block).build())

fun TypeSpec.Builder.overridingSpec(
  method: ExecutableElement,
  block: FunSpecBlock
): TypeSpec.Builder =
  addFunction(FunSpec.overriding(method).apply(block).build())

fun TypeSpec.Builder.overridingSpec(
  method: ExecutableElement,
  enclosing: DeclaredType,
  types: Types,
  block: FunSpecBlock
): TypeSpec.Builder =
  addFunction(
    FunSpec.overriding(
      method, enclosing, types
    ).apply(block).build()
  )

/*
 * Shortcuts for using Function Spec as setter or getter
 */

fun PropertySpec.Builder.setterSpec(
  block: FunSpecBlock
): PropertySpec.Builder =
  setter(FunSpec.setterBuilder().apply(block).build())

fun PropertySpec.Builder.getterSpec(
  block: FunSpecBlock
): PropertySpec.Builder =
  getter(FunSpec.getterBuilder().apply(block).build())
