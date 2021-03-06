# kotlin_for_java_developers
Kotlin Programing Learning course

# General considerations

- Concise: less verbose than Java
- Safe programming language
- Interoperable with Java
- Everything in Kotlin is public and final by default

# Topics

### [Equality check](./src/academy/learnprogramming/equality/Equality.kt)
> You can use == to check structural equality and === to verify referential equality

### [Spelled operators](./src/academy/learnprogramming/spelled_operators/BitOperators.kt)
> Kotlin allow the use of spelled operators: 'and', 'or', 'xor'

### [Smart casting](./src/academy/learnprogramming/smart_casting/Casting.kt)
> After verifyng the instance of an variable, you can treat the variable as if it is already casted
> Under the wood, the compiler performs a casting operation for us

### [String templates](./src/academy/learnprogramming/string_template/StringTemplate.kt)
> $ sign allows the print the value of a variable inside a string text
> $ and curly braces '${}' together prints the avaluation of an expression. Ex: ${a+b}

### [Raw Strings](./src/academy/learnprogramming/raw_strings/RawStrings.kt)
> When you use triple quoted strings, you don't have o scape characters. It can contains line breaks
> but it cannot has tabs

### [Data Types](./src/academy/learnprogramming/datatypes/DataTypes.kt)

- There are no basic data type in Kotlin. Every variable is an object
- When not informed, the data type is inferred accordingdly with the data value
- Kotlin does not convert/cast variables automatically  
- Every data types has two functions that allows conversion to other data types
- Kotlin compiles objects to primitive types under the wood

>> - Int
>> - Long
>> - Double
>> - Short
>> - Byte
>> - String
>> - Float
>> - Char
>> - Boolean
>> - Any
>> - Nothing

### [Arrays](./src/academy/learnprogramming/datatypes/Arrays.kt)
> Collection of elements
> 
> When the array type is not informed, the compiler will infer the type
> 
> Arrays can be initialized with lambda expression
> 
> It is possible to mix data types in arrays
> 
> By using the primitive type array performance boost is generated
> 
> In order to interoperate with Java, primitive array must be passed as arguments
> 
> Primitive arrays allows to specify the size and all indexes will be initialized with the value zero

### [Null References](./src/academy/learnprogramming/null_references/NullReferences.kt)

> Null can not be the value of a non-null 
>
> If you want to sign a null value to a variable you have to explicit tell the compiler that with a question mark after the type of the variable
> 
> Kotlin enforces to do a Null check before using a nullable object interfaces
> 
> **Safe call operator / Safe access (?)**: 
>> - Whenever you are using a nullable variable, you must always use the question mark when refering to the variable
>> 
>> - If the variable is null, the expression will be evaluated to null
>> 
>> - If it is not null, the kotlin will evaluate the expression
> 
> **Elvis operator (?:)**: 
>> - Allows to assign a default value when an expression evaluates to null
> 
> > **Safe casting operator (as?)**:
>> - Allows to cast a variable and assigns null if is not possible to perform the casting
> 
> **Not Null Assetion**
>> Kotlin provides a way to tell the compiler that you are absolutily positive that the variable will not contain null
>? by following the expression with 2 exclamation marks (!!)
> 
> **Let function**
>> - Uses the object tha calls it as a parameter to the lambda and safe execute a block if the object is not null 
> 
> **Array of Nulls**
>> - Kotlin has a interface to create array of nulls as follow
>>```kotlin
>>val nullableInts = arrayOfNulls<Int?>(5)
>>```

### [Access Modifers](./src/academy/learnprogramming/access_modifiers/AccessModifiers.kt)
> Visibility in Kotlin depends on either you are dealing with top level elements **(public by default)** or elements 
> that are class members.
> 
> The default visibility of top level elements is public. If an element is private, then everything in the 
> same file can access it. If you don't specify the modifier, the declaration is public
> 
> Yu can have as many class as you want in a fle. The file name doesn't have to match the class name
> 
> In Kotlin, you can use private in classes
> 
> There are four visibility modifiers: 
> - **public** - Visible everywhere
> - **private** - Visible within the same file
> - **protected** - can't be accessed / used
> - **internal** - visible within the same module
>
> In Kotlin inner classes can't be acccessed by the classes that declares the inner classes
> It enforces its visiblity rules at compile time

###[Classes](./src/academy/learnprogramming/access_modifiers/AccessModifiers.kt)
> In Kotlin, all classes are **public** and **final** by default
> 
> Default and empty constructor is generated by the compiler once a new class is created
> 
> Kotlin has a notion of primarily constructor and that constructor is defined outside the curly braces
>
>```kotlin
>class Employee constructor(firstName: String){
>    val firstName: String
>    
>    init {
>        this.firstName = firstName
>    }
>```
>Kotlin generates boilerplate code for properties once we use the reserved words val/var in the constructor
> 
>```kotlin
>class Employee(val firstName: String){
>}
>```
>
> Secondary constructor do not declare class properties. If we need a new property, we have to declare it
>
>```kotlin
>class Employee(val firstName: String){
>   val fullTime: Boolean
>
>   constructor(firstName: String, val fullTime: Boolean): this(firstName) {
>   }
>}
>```
>
> We can assign default values the primary constructor properties
>
>```kotlin
>class Employee(val firstName: String, var fullTime: Boolean = true){
>}
>```
>
>You can steel having a secondary constructors without having a primary constructor

###[Properties access and backing field](./src/academy/learnprogramming/access_modifiers/AccessModifiers.kt)
> Kotlin allows the genereate gettters and setter for properties but the definition of those methods must come
> immidiatelly after the property declaration and to return the proerty value, we must use the **field** identifier
>
>```kotlin
>class Employee(val firstName: String, fullTime: Boolean = true){
>   var fullTime: Boolean = fullTime
>   get() {
>       return field
>   }
>}
>```

###[Data Class](./src/academy/learnprogramming/access_modifiers/AccessModifiers.kt)
> Kotlin as special identifier for classes that store data only: **data**
> 
> To define a data classe, just start the declaration with _**data**_
> 
> Data classes come with nice  _toString_ funtion, as well a custom implementation of _equals_ and _hasCode_ functions
> and a _copy_ function
> 
> Data classes have to meet certain requirements:
>
> - They must have at least one parameter on the primary constructor
> - All the primary constructor parameters have to be marked var or val
> - Data classes cannot be _abstract_, _sealed_ or inner classes

###[Function](./src/academy/learnprogramming/functions/Functions.kt)
> - Functions with curly braces : block body
> 
> 
> - Functions without curly braces has an equal sign to return the function value : expression body
> 
> 
> - Functions that returns nothing actually returns **Void** under the cover
> 
> 
> - When it comes to function parameters, we always have to specify the parameter's type
> 
> 
> - **Named arguments**: it is possible to associate parameter values with names, which let specific the parameters in any order
> 
> 
> -  We can use special word **vararg** in a function signature when it will receive any number of arguments of specific type.
> We can only have one vararg parameter on the function signature and, if we need to add another parameter we must use named parameter
> because the compiler won't know to which variable it should assign the values.
> In order to solve this, **vararg** arguments should be placed as the last argument
> 
> 
> - The spread operator will unpack an array and passes the elements as individual arguments. The spread operator is the asterisk
> All you have to do is to put it in front of the array variable


###[Extension Function](./src/academy/learnprogramming/functions/ExtensionFunctions.kt)

> Kotlin provides the ability to extend a class functionalities through association by bounding a function
> to a class (Receiver Type) we are pseudo extending. 
> 
> To do that just add the class name and dot in front of the function name. 
> We no longer need the function arguments because the scope of the pseudo function will consider the object the is invoking the extended function.
> 
> Also, we no longer need the use of the expresssion 'this'.
>
> After this association, IntelliJ now suggests the new function as if it is part of the class


###[Inheritance](./src/academy/learnprogramming/inheritance/Printer.kt)

> In order to turn classes extendable and allow overriding operation, we need to use the keyword **open** in front of it
> 
> When a class is defined as abstract there is no need to use the keyword **open**
> 
> It is necessary to defined primary constructor and delegate the subclasses constructor parameters
> 
> To override a function from an abstract class we need to add the **override** keyword on the extended class (subclass)
> and **open** the superclass function
> 
> Just like the classes, abstract functions are open by default and all subclasses have to add override the implementation
> 
> **Overrides something means that that thing is open**
> 
> If we need to prevent that subclasses overrides superclasses functions, we must use the **final** keyword at the function
> 
> The primary constructor signatures for the parent and child classes doesn't have to match
> 
> Data classes are close tight. They can't be extended nor abstract

###[Interfaces](./src/academy/learnprogramming/inheritance/Interfaces.kt)

> **Interfaces** are open and extendable by default
> 
> Classes can implement more than one interface
> 
> Interfaces can have properties and there properties doesn't have to be abstract. It is possible to have 
> accessors for them and sub interfaces can override the accessors
> 
> Properties initializers is not allow in interfaces. Instead, we can use custom _get_
> However, the backfield are not available for interfaces

###[Singleton](./src/academy/learnprogramming/singleton/Singleton.kt)

> The **Object** keyword allows to declare a class and its instance at the same time
> 
> There are tree use cases for the **object** keyword:
> * Singleton:
>    - there is no constructor
>    - there is no need to instantiate the singleton class. 
>    - the JVM will create the one singleton object when the class is invoked at first time
>    - use the class name to access the object properties and functions
> * Companion objects:
>    - equivalent to Java static functionality, it allows to acccess a class properties and functions without having 
       an instance of the class
>    - the accessible properties and functions must be in a block prefixed with `companion object` and can be 
       invoked by class name
      - You can use them to call private constructor and implement the Factory Pattern
> * [Object expressions](./src/academy/learnprogramming/singleton/ObjectExpression.kt): allow the use of anonymous object to implement interfaces

###[Enums](./src/academy/learnprogramming/enums/Enums.kt)
> Enums in Kotlin has the same structure and syntax as JAVA
> 
> It is necessary to use a semicolon after the last enum value and before defining functions in enums
> 
> This is the only exception to the no semicolon rule in Kotlin
> 
> Enums values can implement abstract functions declared by the Enum itself


###[Imports](./src/academy/learnprogramming/imports/Imports.kt)
> In Kotlin, package name doesn't have to match the directory structure name. Although it is highly recommended following this practice
> 
> Top level function can be imported from different packages
> 
> It is not possible to import from other modules unless there a module dependency between the
> 
> Import alias allows to give names to the imported classes / functions / top level functions / extension functions using `as` keyword
> 
> CTRL + ALT + O cleans up all unsed imports