#!/bin/bash
cd atom
mvn clean install
cd ../groovy
mvn clean install
cd ../ruby
mvn clean install
cd ../scala
mvn clean install
cd ../yaml
mvn clean install

