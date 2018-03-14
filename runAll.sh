#!/bin/bash
cd atom
mvn clean install -U
cd ../groovy
mvn clean install -U
cd ../ruby
mvn clean install -U
cd ../scala
mvn clean install -U
cd ../yaml
mvn clean install -U
cd ../java
mvn clean install -U

