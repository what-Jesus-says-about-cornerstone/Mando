#!/bin/bash

repl(){
  clj \
    -J-Dclojure.core.async.pool-size=1 \
    -X:repl:$1 Ripley.core/process \
    :main-ns puck.${1}-main
}

main(){
  clojure \
    -J-Dclojure.core.async.pool-size=1 \
    -M:$1 -m puck.${1}-main
}

jar(){

  clojure \
    -X:identicon Zazu.core/process \
    :word "\"$1\"" \
    :filename '"out/identicon/icon.png"' \
    :size 256

  rm -rf out/*.jar
  clojure \
    -X:uberjar Genie.core/process \
    :main-ns puck.${1}-main \
    :filename "\"out/puck-$1-$(git rev-parse --short HEAD).jar\"" \
    :paths '["src" "out/identicon"]'
}

release(){
  jar
}

"$@"