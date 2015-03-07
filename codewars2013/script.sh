#!/bin/bash
for f in fg *-1.txt; do
	FILENAME="$(echo "$f" | cut -d '-' -f 1)"
	FILENAME="$FILENAME.txt"
	mv "$f" "$FILENAME"
done
