#!/bin/bash

repl(){
  clj \
    -J-Dclojure.core.async.pool-size=8 \
    -X:Ripley Ripley.core/process \
    :main-ns Mando.main
}


main(){
  clojure \
    -J-Dclojure.core.async.pool-size=8 \
    -M -m Mando.main
}

jar(){

  rm -rf out/*.jar out/classes
  clojure \
    -X:Genie Genie.core/process \
    :main-ns Mando.main \
    :filename "\"out/Mando-$(git rev-parse --short HEAD).jar\"" \
    :paths '["src"]'
}

release(){
  jar
}

"$@"