#!/bin/bash

repl(){
  clj \
    -J-Dclojure.core.async.pool-size=1 \
    -X:repl:$1 Ripley.core/process \
    :main-ns bounty-puck.${1}-main
}

"$@"