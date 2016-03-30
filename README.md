
# README

```
user@laptop:~/workspace/pack$ sbt dependency-tree

[info] Loading project definition from /home/mjost/workspace/pack/project
[info] Set current project to pack (in build file:/home/mjost/workspace/pack/)
[info] eu.pepot.eu:pack_2.10:0.1 [S]
[info]   +-org.apache.hadoop:hadoop-yarn-server-nodemanager:2.2.0
[info]     +-com.google.inject.extensions:guice-servlet:3.0
[info]     | +-com.google.inject:guice:3.0
[info]     |   +-aopalliance:aopalliance:1.0
[info]     |   +-javax.inject:javax.inject:1
[info]     |   +-org.sonatype.sisu.inject:cglib:2.2.1-v20090111
[info]     |     +-asm:asm:3.1
[info]     |     
[info]     +-com.google.inject:guice:3.0
[info]     | +-aopalliance:aopalliance:1.0
[info]     | +-javax.inject:javax.inject:1
[info]     | +-org.sonatype.sisu.inject:cglib:2.2.1-v20090111
[info]     |   +-asm:asm:3.1
[info]     |   
[info]     +-com.google.protobuf:protobuf-java:2.5.0
[info]     +-com.sun.jersey.contribs:jersey-guice:1.9
[info]     | +-com.google.inject.extensions:guice-servlet:3.0
[info]     | | +-com.google.inject:guice:3.0
[info]     | |   +-aopalliance:aopalliance:1.0
[info]     | |   +-javax.inject:javax.inject:1
[info]     | |   +-org.sonatype.sisu.inject:cglib:2.2.1-v20090111
[info]     | |     +-asm:asm:3.1
[info]     | |     
[info]     | +-com.google.inject:guice:3.0
[info]     | | +-aopalliance:aopalliance:1.0
[info]     | | +-javax.inject:javax.inject:1
[info]     | | +-org.sonatype.sisu.inject:cglib:2.2.1-v20090111
[info]     | |   +-asm:asm:3.1
[info]     | |   
[info]     | +-javax.inject:javax.inject:1
[info]     | 
[info]     +-com.sun.jersey.jersey-test-framework:jersey-test-framework-grizzly2:1.9
[info]     +-com.sun.jersey:jersey-json:1.9
[info]     | +-com.sun.xml.bind:jaxb-impl:2.2.3-1
[info]     | | +-javax.xml.bind:jaxb-api:2.2.2
[info]     | |   +-javax.activation:activation:1.1
[info]     | |   
[info]     | +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | +-org.codehaus.jackson:jackson-jaxrs:1.8.3
[info]     | | +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | +-org.codehaus.jackson:jackson-mapper-asl:1.8.3
[info]     | |   +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | |   
[info]     | +-org.codehaus.jackson:jackson-mapper-asl:1.8.3
[info]     | | +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | 
[info]     | +-org.codehaus.jackson:jackson-xc:1.8.3
[info]     | | +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | +-org.codehaus.jackson:jackson-mapper-asl:1.8.3
[info]     | |   +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | |   
[info]     | +-org.codehaus.jettison:jettison:1.1
[info]     |   +-stax:stax-api:1.0.1
[info]     |   
[info]     +-com.sun.jersey:jersey-server:1.9
[info]     | +-asm:asm:3.1
[info]     | 
[info]     +-commons-io:commons-io:2.1
[info]     +-io.netty:netty:3.6.2.Final
[info]     +-org.apache.hadoop:hadoop-annotations:2.2.0
[info]     +-org.apache.hadoop:hadoop-yarn-server-common:2.2.0
[info]     | +-com.google.inject.extensions:guice-servlet:3.0
[info]     | | +-com.google.inject:guice:3.0
[info]     | |   +-aopalliance:aopalliance:1.0
[info]     | |   +-javax.inject:javax.inject:1
[info]     | |   +-org.sonatype.sisu.inject:cglib:2.2.1-v20090111
[info]     | |     +-asm:asm:3.1
[info]     | |     
[info]     | +-com.google.inject:guice:3.0
[info]     | | +-aopalliance:aopalliance:1.0
[info]     | | +-javax.inject:javax.inject:1
[info]     | | +-org.sonatype.sisu.inject:cglib:2.2.1-v20090111
[info]     | |   +-asm:asm:3.1
[info]     | |   
[info]     | +-com.google.protobuf:protobuf-java:2.5.0
[info]     | +-com.sun.jersey.contribs:jersey-guice:1.9
[info]     | | +-com.google.inject.extensions:guice-servlet:3.0
[info]     | | | +-com.google.inject:guice:3.0
[info]     | | |   +-aopalliance:aopalliance:1.0
[info]     | | |   +-javax.inject:javax.inject:1
[info]     | | |   +-org.sonatype.sisu.inject:cglib:2.2.1-v20090111
[info]     | | |     +-asm:asm:3.1
[info]     | | |     
[info]     | | +-com.google.inject:guice:3.0
[info]     | | | +-aopalliance:aopalliance:1.0
[info]     | | | +-javax.inject:javax.inject:1
[info]     | | | +-org.sonatype.sisu.inject:cglib:2.2.1-v20090111
[info]     | | |   +-asm:asm:3.1
[info]     | | |   
[info]     | | +-javax.inject:javax.inject:1
[info]     | | 
[info]     | +-com.sun.jersey.jersey-test-framework:jersey-test-framework-grizzly2:1.9
[info]     | +-com.sun.jersey:jersey-json:1.9
[info]     | | +-com.sun.xml.bind:jaxb-impl:2.2.3-1
[info]     | | | +-javax.xml.bind:jaxb-api:2.2.2
[info]     | | |   +-javax.activation:activation:1.1
[info]     | | |   
[info]     | | +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | +-org.codehaus.jackson:jackson-jaxrs:1.8.3
[info]     | | | +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | | +-org.codehaus.jackson:jackson-mapper-asl:1.8.3
[info]     | | |   +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | |   
[info]     | | +-org.codehaus.jackson:jackson-mapper-asl:1.8.3
[info]     | | | +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | | 
[info]     | | +-org.codehaus.jackson:jackson-xc:1.8.3
[info]     | | | +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | | +-org.codehaus.jackson:jackson-mapper-asl:1.8.3
[info]     | | |   +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | |   
[info]     | | +-org.codehaus.jettison:jettison:1.1
[info]     | |   +-stax:stax-api:1.0.1
[info]     | |   
[info]     | +-com.sun.jersey:jersey-server:1.9
[info]     | | +-asm:asm:3.1
[info]     | | 
[info]     | +-commons-io:commons-io:2.1
[info]     | +-io.netty:netty:3.6.2.Final
[info]     | +-org.apache.hadoop:hadoop-annotations:2.2.0
[info]     | +-org.apache.hadoop:hadoop-yarn-common:2.2.0
[info]     | | +-com.google.inject.extensions:guice-servlet:3.0
[info]     | | | +-com.google.inject:guice:3.0
[info]     | | |   +-aopalliance:aopalliance:1.0
[info]     | | |   +-javax.inject:javax.inject:1
[info]     | | |   +-org.sonatype.sisu.inject:cglib:2.2.1-v20090111
[info]     | | |     +-asm:asm:3.1
[info]     | | |     
[info]     | | +-com.google.inject:guice:3.0
[info]     | | | +-aopalliance:aopalliance:1.0
[info]     | | | +-javax.inject:javax.inject:1
[info]     | | | +-org.sonatype.sisu.inject:cglib:2.2.1-v20090111
[info]     | | |   +-asm:asm:3.1
[info]     | | |   
[info]     | | +-com.google.protobuf:protobuf-java:2.5.0
[info]     | | +-com.sun.jersey.contribs:jersey-guice:1.9
[info]     | | | +-com.google.inject.extensions:guice-servlet:3.0
[info]     | | | | +-com.google.inject:guice:3.0
[info]     | | | |   +-aopalliance:aopalliance:1.0
[info]     | | | |   +-javax.inject:javax.inject:1
[info]     | | | |   +-org.sonatype.sisu.inject:cglib:2.2.1-v20090111
[info]     | | | |     +-asm:asm:3.1
[info]     | | | |     
[info]     | | | +-com.google.inject:guice:3.0
[info]     | | | | +-aopalliance:aopalliance:1.0
[info]     | | | | +-javax.inject:javax.inject:1
[info]     | | | | +-org.sonatype.sisu.inject:cglib:2.2.1-v20090111
[info]     | | | |   +-asm:asm:3.1
[info]     | | | |   
[info]     | | | +-javax.inject:javax.inject:1
[info]     | | | 
[info]     | | +-com.sun.jersey.jersey-test-framework:jersey-test-framework-grizzly2:1.9
[info]     | | +-com.sun.jersey:jersey-json:1.9
[info]     | | | +-com.sun.xml.bind:jaxb-impl:2.2.3-1
[info]     | | | | +-javax.xml.bind:jaxb-api:2.2.2
[info]     | | | |   +-javax.activation:activation:1.1
[info]     | | | |   
[info]     | | | +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | | +-org.codehaus.jackson:jackson-jaxrs:1.8.3
[info]     | | | | +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | | | +-org.codehaus.jackson:jackson-mapper-asl:1.8.3
[info]     | | | |   +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | | |   
[info]     | | | +-org.codehaus.jackson:jackson-mapper-asl:1.8.3
[info]     | | | | +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | | | 
[info]     | | | +-org.codehaus.jackson:jackson-xc:1.8.3
[info]     | | | | +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | | | +-org.codehaus.jackson:jackson-mapper-asl:1.8.3
[info]     | | | |   +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | | |   
[info]     | | | +-org.codehaus.jettison:jettison:1.1
[info]     | | |   +-stax:stax-api:1.0.1
[info]     | | |   
[info]     | | +-com.sun.jersey:jersey-server:1.9
[info]     | | | +-asm:asm:3.1
[info]     | | | 
[info]     | | +-commons-io:commons-io:2.1
[info]     | | +-io.netty:netty:3.6.2.Final
[info]     | | +-log4j:log4j:1.2.17
[info]     | | +-org.apache.hadoop:hadoop-annotations:2.2.0
[info]     | | +-org.apache.hadoop:hadoop-yarn-api:2.2.0
[info]     | | | +-com.google.inject.extensions:guice-servlet:3.0
[info]     | | | | +-com.google.inject:guice:3.0
[info]     | | | |   +-aopalliance:aopalliance:1.0
[info]     | | | |   +-javax.inject:javax.inject:1
[info]     | | | |   +-org.sonatype.sisu.inject:cglib:2.2.1-v20090111
[info]     | | | |     +-asm:asm:3.1
[info]     | | | |     
[info]     | | | +-com.google.inject:guice:3.0
[info]     | | | | +-aopalliance:aopalliance:1.0
[info]     | | | | +-javax.inject:javax.inject:1
[info]     | | | | +-org.sonatype.sisu.inject:cglib:2.2.1-v20090111
[info]     | | | |   +-asm:asm:3.1
[info]     | | | |   
[info]     | | | +-com.google.protobuf:protobuf-java:2.5.0
[info]     | | | +-com.sun.jersey.contribs:jersey-guice:1.9
[info]     | | | | +-com.google.inject.extensions:guice-servlet:3.0
[info]     | | | | | +-com.google.inject:guice:3.0
[info]     | | | | |   +-aopalliance:aopalliance:1.0
[info]     | | | | |   +-javax.inject:javax.inject:1
[info]     | | | | |   +-org.sonatype.sisu.inject:cglib:2.2.1-v20090111
[info]     | | | | |     +-asm:asm:3.1
[info]     | | | | |     
[info]     | | | | +-com.google.inject:guice:3.0
[info]     | | | | | +-aopalliance:aopalliance:1.0
[info]     | | | | | +-javax.inject:javax.inject:1
[info]     | | | | | +-org.sonatype.sisu.inject:cglib:2.2.1-v20090111
[info]     | | | | |   +-asm:asm:3.1
[info]     | | | | |   
[info]     | | | | +-javax.inject:javax.inject:1
[info]     | | | | 
[info]     | | | +-com.sun.jersey.jersey-test-framework:jersey-test-framework-grizzly2:1.9
[info]     | | | +-com.sun.jersey:jersey-json:1.9
[info]     | | | | +-com.sun.xml.bind:jaxb-impl:2.2.3-1
[info]     | | | | | +-javax.xml.bind:jaxb-api:2.2.2
[info]     | | | | |   +-javax.activation:activation:1.1
[info]     | | | | |   
[info]     | | | | +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | | | +-org.codehaus.jackson:jackson-jaxrs:1.8.3
[info]     | | | | | +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | | | | +-org.codehaus.jackson:jackson-mapper-asl:1.8.3
[info]     | | | | |   +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | | | |   
[info]     | | | | +-org.codehaus.jackson:jackson-mapper-asl:1.8.3
[info]     | | | | | +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | | | | 
[info]     | | | | +-org.codehaus.jackson:jackson-xc:1.8.3
[info]     | | | | | +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | | | | +-org.codehaus.jackson:jackson-mapper-asl:1.8.3
[info]     | | | | |   +-org.codehaus.jackson:jackson-core-asl:1.8.3
[info]     | | | | |   
[info]     | | | | +-org.codehaus.jettison:jettison:1.1
[info]     | | | |   +-stax:stax-api:1.0.1
[info]     | | | |   
[info]     | | | +-com.sun.jersey:jersey-server:1.9
[info]     | | | | +-asm:asm:3.1
[info]     | | | | 
[info]     | | | +-commons-io:commons-io:2.1
[info]     | | | +-io.netty:netty:3.6.2.Final
[info]     | | | +-org.apache.hadoop:hadoop-annotations:2.2.0
[info]     | | | +-org.slf4j:slf4j-api:1.7.5
[info]     | | | +-org.slf4j:slf4j-log4j12:1.7.5
[info]     | | |   +-log4j:log4j:1.2.17
[info]     | | |   +-org.slf4j:slf4j-api:1.7.5
[info]     | | |   
[info]     | | +-org.slf4j:slf4j-api:1.7.5
[info]     | | +-org.slf4j:slf4j-log4j12:1.7.5
[info]     | |   +-log4j:log4j:1.2.17
[info]     | |   +-org.slf4j:slf4j-api:1.7.5
[info]     | |   
[info]     | +-org.slf4j:slf4j-api:1.7.5
[info]     | +-org.slf4j:slf4j-log4j12:1.7.5
[info]     |   +-log4j:log4j:1.2.17
[info]     |   +-org.slf4j:slf4j-api:1.7.5
[info]     |   
[info]     +-org.slf4j:slf4j-api:1.7.5
[info]     +-org.slf4j:slf4j-log4j12:1.7.5
[info]       +-log4j:log4j:1.2.17
[info]       +-org.slf4j:slf4j-api:1.7.5
[info]       
[success] Total time: 0 s, completed Mar 30, 2016 11:49:09 PM

```
