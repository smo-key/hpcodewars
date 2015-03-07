#!/bin/bash
DIR=$( cd "$( dirname "${BASH_SOURCE[0]}" )" && pwd )
for f in bin/*.class; do
  cd "$DIR"
  FNAME="$(basename $f)"
  FNAME="${FNAME%.*}"
  if [[ "$FNAME" == "r" ]]; then
    continue
  fi
  echo "Building $FNAME..."
  ./build.sh "$FNAME" $1
done
