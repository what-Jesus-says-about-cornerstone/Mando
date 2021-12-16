#!/bin/bash

repl(){
  clj \
    -J-Dclojure.core.async.pool-size=1 \
    -X:repl Ripley.core/process \
    :main-ns Mando.main
}

main(){
  clojure \
    -J-Dclojure.core.async.pool-size=1 \
    -M -m Mando.main
}

uberjar(){

  clojure \
    -X:identicon Zazu.core/process \
    :word '"Mando"' \
    :filename '"out/identicon/icon.png"' \
    :size 256

  rm -rf out/*.jar
  clojure \
    -X:uberjar Genie.core/process \
    :main-ns Mando.main \
    :filename "\"out/Mando.jar\"" \
    :paths '["src" "out/identicon"]'
}

release(){
  uberjar
}

"$@"