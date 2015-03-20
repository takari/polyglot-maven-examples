#-*- mode: ruby -*-

Gem::Specification.new do |s|
  s.name = 'example'
  s.version = "2"
  s.author = 'example person'
  s.email = [ 'mail@example.com' ]
  s.summary = 'gem with jar'
  s.description = 'gem with empty jar and jar dependencies'

  s.files << Dir[ 'lib/**/*.rb' ]
  s.files << Dir[ 'lib/*.jar' ]
  s.files << Dir[ '*file' ]
  s.files << 'example.gemspec'

  s.add_runtime_dependency 'jar-dependencies', '~>0.0.6'

  s.requirements << "jar org.bouncycastle:bcpkix-jdk15on, 1.49"
  s.requirements << "jar org.bouncycastle:bcprov-jdk15on, 1.49"

  s.add_development_dependency 'rspec', '~> 2.14.0'
  s.add_development_dependency 'rake', '~> 10.3.2'
end

# vim: syntax=Ruby
