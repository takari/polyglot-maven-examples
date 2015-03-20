#-*- mode: ruby -*-

inherit 'com.example:parent:1', :relative_path => '../pom.rb'

gem 'example', '2'

jruby_plugin! :gem, :includeRubygemsInResource => true

# vim: syntax=Ruby
