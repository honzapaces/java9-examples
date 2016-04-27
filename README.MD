# JDK 9 and beyond

<!-- TOC depthFrom:1 depthTo:6 withLinks:1 updateOnSave:1 orderedList:0 -->

- [JDK 9 and beyond](#jdk-9-and-beyond)
	- [Glossary](#glossary)
	- [The beyond](#the-beyond)
	- [When?](#when)
	- [What?](#what)
	- [Where](#where)
	- [Java REPL (Project Kulla)](#java-repl-project-kulla)
			- [Example:](#example)
		- [Resources](#resources)
	- [JEP 102: Process API Updates](#jep-102-process-api-updates)
		- [Resources](#resources)
		- [Java Modularity (Project Jigsaw)](#java-modularity-project-jigsaw)
		- [Resources](#resources)
			- [Related JEPs](#related-jeps)
		- [JEP 280: Indify String Concatenation](#jep-280-indify-string-concatenation)
			- [One sentence summary](#one-sentence-summary)
		- [JEP 248: Make G1 the Default Garbage Collector](#jep-248-make-g1-the-default-garbage-collector)
		- [JEP 214: Remove GC Combinations Deprecated in JDK 8](#jep-214-remove-gc-combinations-deprecated-in-jdk-8)
		- [JEP 238: Multi-Release JAR Files](#jep-238-multi-release-jar-files)
		- [JEP 211: Elide Deprecation Warnings on Import Statements](#jep-211-elide-deprecation-warnings-on-import-statements)
		- [JEP 213: Milling Project Coin](#jep-213-milling-project-coin)
		- [JEP 223: New Version-String Scheme](#jep-223-new-version-string-scheme)
		- [JEP 226: UTF-8 Property Files](#jep-226-utf-8-property-files)
		- [JEP 227: Unicode 7.0](#jep-227-unicode-70)
		- [JEP 267: Unicode 8.0](#jep-267-unicode-80)
		- [JEP 229: Create PKCS12 Keystores by Default](#jep-229-create-pkcs12-keystores-by-default)
		- [JEP 231: Remove Launch-Time JRE Version Selection](#jep-231-remove-launch-time-jre-version-selection)
		- [JEP 237: Linux/AArch64 Port](#jep-237-linuxaarch64-port)
		- [JEP 264: Platform Logging API and Service](#jep-264-platform-logging-api-and-service)
			- [ADD CODE](#add-code)
		- [JEP 266: More Concurrency Updates](#jep-266-more-concurrency-updates)
			- [TODO](#todo)
			- [ADD CODE](#add-code)
		- [JEP 268: XML Catalogs](#jep-268-xml-catalogs)
			- [TODO](#todo)
			- [ADD CODE](#add-code)
		- [JEP 269: Convenience Factory Methods for Collections](#jep-269-convenience-factory-methods-for-collections)
			- [TODO](#todo)
			- [ADD CODE](#add-code)
			- [Others:](#others)
			- [JVM logging improvements](#jvm-logging-improvements)
			- [JVM Internal enhancments](#jvm-internal-enhancments)
				- [Removed JDK tools](#removed-jdk-tools)
				- [SSL Improvements](#ssl-improvements)
				- [JavaDoc imporvements](#javadoc-imporvements)
				- [Peroformance improvements](#peroformance-improvements)
				- [Compiler improvements](#compiler-improvements)
			- [JDK Development and maintainbility improvements](#jdk-development-and-maintainbility-improvements)
			- [String improvements](#string-improvements)
			- [To look into](#to-look-into)
			- [Other others](#other-others)

<!-- /TOC -->

## Glossary
**JEP** Java Enhancement proposal (Currently JEP process 1 is being proposed to be replaced by JEP 2.0)
* [JEP List](http://openjdk.java.net/jeps/0)
* [JEP 1 Process](http://openjdk.java.net/jeps/1)
* [JEP 2.0 Process proposal](http://cr.openjdk.java.net/~mr/jep/jep-2.0-02.html)

**JSR** Java Specification request
* [List of all JSRs](https://www.jcp.org/en/jsr/all)
## The beyond
Following features didn't make the Java 9 cut and are probably planned for Java 10 or later
* [Lightweight JSON API](http://openjdk.java.net/jeps/198)
* [JSR 354 - Money and Currency API](http://javamoney.java.net)
## When?
[Java 9 release countdown](http://www.java9countdown.xyz/)
## What?
* [List of JEPs targeted to JDK 9](http://openjdk.java.net/projects/jdk9/)
* [JDK 9 Outreach](https://wiki.openjdk.java.net/display/Adoption/JDK+9+Outreach)
* [Current Java 9 JavaDoc](http://download.java.net/jdk9/docs/api/index.html)

## Where
Current JDK 9 Early access release:
https://jdk9.java.net/download/

## Java REPL (Project Kulla)
Run:
`
jdk9_path/bin/jshell
`

Basic commands:
```
/help
/help intro
/vars
/methods

/exit
...
```
#### Example:
```
-> /help
|  Type a Java language expression, statement, or declaration.
|  Or type one of the following commands:

|     /list [all|start|<name or id>]                       -- list the source you have typed
|     /edit <name or id>                                   -- edit a source entry referenced by name or id
|     /drop <name or id>                                   -- delete a source entry referenced by name or id
|     /save [all|history|start] <file>                     -- Save snippet source to a file.
|     /open <file>                                         -- open a file as source input
|     /vars                                                -- list the declared variables and their values
|     /methods                                             -- list the declared methods and their signatures
|     /classes                                             -- list the declared classes
|     /imports                                             -- list the imported items
|     /exit                                                -- exit jshell
|     /reset                                               -- reset jshell
|     /reload [restore] [quiet]                            -- reset and replay relevant history -- current or previous (restore)

|     /classpath <path>                                    -- add a path to the classpath
|     /history                                             -- history of what you have typed
|     /help [<command>|<subject>]                          -- get information about jshell
|     /set editor|start|feedback|newmode|prompt|format ... -- set jshell configuration information
|     /? [<command>|<subject>]                             -- get information about jshell
|     /!                                                   -- re-run last snippet
|     /<id>                                                -- re-run snippet by id
|     /-<n>                                                -- re-run n-th previous snippet
|
|  For more information type '/help' followed by the name of command or a subject.
|  For example '/help /list' or '/help intro'.  Subjects:

|     intro     -- an introduction to the jshell tool
|     shortcuts -- a description of shortcuts
```
```
|  Welcome to JShell -- Version 9-ea
|  For an introduction type: /help intro

-> 7 + 12 * 2
|  Expression value is: 31
|    assigned to temporary variable $1 of type int
|
|
-> int add(int a, int b){
>> return a+b;}
|  Added method add(int,int)

-> add(25,25)
|  Expression value is: 50
|    assigned to temporary variable $3 of type int

->
```

###Resources
* [JEP 222: jshell: The Java Shell (Read-Eval-Print Loop)](http://openjdk.java.net/jeps/222)
* [JavaWorld: What REPL means for Java](http://www.javaworld.com/article/2971152/core-java/what-repl-means-for-java.html)

## JEP 102: Process API Updates
Ability

* [JEP 102: Process API Updates](http://openjdk.java.net/jeps/102)

### Resources

### Java Modularity (Project Jigsaw)

###Resources
* [https://github.com/AdoptOpenJDK/jdk9-jigsaw](https://github.com/AdoptOpenJDK/jdk9-jigsaw)
#### Related JEPs
* [JEP 200: The Modular JDK](http://openjdk.java.net/jeps/200)
* [JEP 261: Module System](http://openjdk.java.net/jeps/261)
* [JEP 201: Modular Source Code](http://openjdk.java.net/jeps/201)
* [JEP 220: Modular Run-Time Images](http://openjdk.java.net/jeps/220)
* [JEP 260: Encapsulate Most Internal APIs](http://openjdk.java.net/jeps/260)
** Possible braking changes
* [JEP 275: Modular Java Application Packaging](http://openjdk.java.net/jeps/275)
** packaging tools for support java modules
* [JEP 282: jlink: The Java Linker](http://openjdk.java.net/jeps/282)
### JEP 280: Indify String Concatenation
#### One sentence summary
Bytecode String concatenation adjustments to use InvokeDynamics
* [Original JEP link](http://openjdk.java.net/jeps/280)

### JEP 248: Make G1 the Default Garbage Collector
Change default garbage collection algorhitm, effectively changing the heap structure.
[JEP 248: Make G1 the Default Garbage Collector](http://openjdk.java.net/jeps/248)

### JEP 214: Remove GC Combinations Deprecated in JDK 8
Streamlining of the GC settings combination.

### JEP 238: Multi-Release JAR Files
Support for multiple version of library in one jar file, encourage adpotion of the new language features.

[Original JEP link](http://openjdk.java.net/jeps/238)

### JEP 211: Elide Deprecation Warnings on Import Statements
Deprecation warning can now be suppressed.

[Original JEP link](http://openjdk.java.net/jeps/211)
###JEP 213: Milling Project Coin
Various improvements to features added in Java 7:
   * @SafeVarArgs
   * Allow effectively-final variables to be used as resources in the try-with-resources statement.
   * Allow diamond with anonymous classes if the argument type of the inferred type is denotable.
   * _ underscore no longer legal identifier name
   * private interface methods

[Original JEP link](http://openjdk.java.net/jeps/212)



[Original JEP link](http://openjdk.java.net/jeps/214)

### JEP 223: New Version-String Scheme
Changing the Java versioning scheme for better human and machine readbility
Pre Java9 pattern:
```
JDK 7 Update 60
1.7.0_60
JDK 7u60
```
New versioning:
```
$MAJOR.$MINOR.$SECURITY
e.g. 9.0.0
```
[Original JEP link](http://openjdk.java.net/jeps/223)

### JEP 226: UTF-8 Property Files
UTF-8 property files supported as default by ResourceBundle, (in case of failure falls back to legacy ISO)

[Original JEP link](http://openjdk.java.net/jeps/226)

### JEP 227: Unicode 7.0
Add Unicode 7.0 support vs Java 8 Unicode 6.2
[Original JEP link](http://openjdk.java.net/jeps/227)

### JEP 267: Unicode 8.0
Add Unicode 8.0 support vs Java 8 Unicode 6.2
[Original JEP link](http://openjdk.java.net/jeps/267)

### JEP 229: Create PKCS12 Keystores by Default
Transition the default keystore type from JKS to PKCS12.
[Original JEP link](http://openjdk.java.net/jeps/229)

### JEP 231: Remove Launch-Time JRE Version Selection
Ability to request specific JRE version in application manifest has been removed.
[Original JEP link](http://openjdk.java.net/jeps/231)

### JEP 237: Linux/AArch64 Port
Port JDK to ARM architecture
[Original JEP link](http://openjdk.java.net/jeps/237)

### JEP 264: Platform Logging API and Service
Modernization of java.util.logging similar to SLF4J
[Original JEP link](http://openjdk.java.net/jeps/264)
#### ADD CODE

### JEP 266: More Concurrency Updates
#### TODO
Improvements to CompletableFuture API
[Original JEP link](http://openjdk.java.net/jeps/266)
#### ADD CODE

### JEP 268: XML Catalogs
#### TODO
standard XML Catalog API
[Original JEP link](http://openjdk.java.net/jeps/268)
#### ADD CODE

### JEP 269: Convenience Factory Methods for Collections
#### TODO
standard XML Catalog API
[Original JEP link](http://openjdk.java.net/jeps/269)
#### ADD CODE

#### Others:
Not 100% currently covered by this document.

#### JVM logging improvements
* [JEP 158: Unified JVM Logging](http://openjdk.java.net/jeps/158)
* [JEP 271: Unified GC Logging](http://openjdk.java.net/jeps/271)

#### JVM Internal enhancments
Deserves more research
* [JEP 197: Segmented Code Cache](http://openjdk.java.net/jeps/197)
** Performance improvements adjusting code cache

##### Removed JDK tools
* [JEP 240: Remove the JVM TI hprof Agent](http://openjdk.java.net/jeps/240)
* [JEP 241: Remove the jhat Tool](http://openjdk.java.net/jeps/241)

##### SSL Improvements
* [JEP 244: TLS Application-Layer Protocol Negotiation Extension](http://openjdk.java.net/jeps/244)
** Add support for TLS ALPN
* [JEP 246: Leverage CPU Instructions for GHASH and RSA](http://openjdk.java.net/jeps/246)
* [JEP 249: OCSP Stapling for TLS](http://openjdk.java.net/jeps/249)
* [JEP 273: DRBG-Based SecureRandom Implementations](http://openjdk.java.net/jeps/273)

##### JavaDoc imporvements
* [JEP 221: Simplified Doclet API](http://openjdk.java.net/jeps/221)
** Improvements to JavaDoc
* [JEP 224: HTML5 Javadoc](http://openjdk.java.net/jeps/224)
** Javadoc to generate HTML5
* [JEP 225: Javadoc Search](http://openjdk.java.net/jeps/225)
** Searchbox for generated Java doc [example](http://download.java.net/jdk9/docs/api/index.html)


##### Peroformance improvements
* [JEP 232: Improve Secure Application Performance](http://openjdk.java.net/jeps/232)

##### Compiler improvements
* [JEP 215: Tiered Attribution for javac](http://openjdk.java.net/jeps/215)
* [JEP 216: Process Import Statements Correctly](http://openjdk.java.net/jeps/216)
* [JEP 217: Annotations Pipeline 2.0](http://openjdk.java.net/jeps/217)
** Better compiler handling of annotation features introduced in Java8

#### JDK Development and maintainbility improvements
* [JEP 233: Generate Run-Time Compiler Tests Automatically](http://openjdk.java.net/jeps/233)
* [JEP 235: Test Class-File Attributes Generated by javac](http://openjdk.java.net/jeps/235)

#### String improvements
* [JEP 280: Indify String Concatenation](http://openjdk.java.net/jeps/280)
** Compiler improvements to use invoke dynamics instead of string buidler transfromations
* [JEP 250: Store Interned Strings in CDS Archives](http://openjdk.java.net/jeps/250)
** Different memory String handling, only supported for G1 gc and 64bit platform.
* [JEP 254: Compact Strings](http://openjdk.java.net/jeps/254)
** More efficient memory string storage, move away from stroing UTF-16 characters

#### To look into
* [JEP 259: Stack-Walking API](http://openjdk.java.net/jeps/259)
* [JEP 270: Reserved Stack Areas for Critical Sections](http://openjdk.java.net/jeps/270)
* [JEP 285: Spin-Wait Hints](http://openjdk.java.net/jeps/285)

#### Other others
* [JEP 212: Resolve Lint and Doclint Warnings](http://openjdk.java.net/jeps/212)
* [JEP 219: Datagram Transport Layer Security (DTLS)](http://openjdk.java.net/jeps/219)
*** API definition for DTLS support. Not transport specific features
* [JEP 228: Add More Diagnostic Commands](http://openjdk.java.net/jeps/228)
* [JEP 236: Parser API for Nashorn](http://openjdk.java.net/jeps/236)
* [JEP 243: Java-Level JVM Compiler Interface](http://openjdk.java.net/jeps/243)
* [JEP 251: Multi-Resolution Images](http://openjdk.java.net/jeps/251)
* [JEP 252: Use CLDR Locale Data by Default](http://openjdk.java.net/jeps/252)
* [JEP 253: Prepare JavaFX UI Controls & CSS APIs for Modularization](http://openjdk.java.net/jeps/253)
* [JEP 255: Merge Selected Xerces 2.11.0 Updates into JAXP](http://openjdk.java.net/jeps/255)
* [JEP 256: BeanInfo Annotations](http://openjdk.java.net/jeps/256)
* [JEP 257: Update JavaFX/Media to Newer Version of GStreamer](http://openjdk.java.net/jeps/257)
* [JEP 258: HarfBuzz Font-Layout Engine](http://openjdk.java.net/jeps/258)
* [JEP 262: TIFF Image I/O](http://openjdk.java.net/jeps/262)
* [JEP 263: HiDPI Graphics on Windows and Linux](http://openjdk.java.net/jeps/263)
* [JEP 265: Marlin Graphics Renderer](http://openjdk.java.net/jeps/265)
* [JEP 272: Platform-Specific Desktop Features](http://openjdk.java.net/jeps/272)
** Fixing no longer availible internal api, seems MacOS related (Task bar etc.)
