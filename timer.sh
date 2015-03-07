echo Starting timer...
VAL1="60"
if [[ "$1" != "" ]]; then
	VAL1="$1"
fi
VAL1=$((VAL1 * 2))
A=0
while true; do
	if [ ! $((VAL1 - A)) -gt 0 ]; then
		break
	fi
	echo "Timer at $A seconds"
	sleep 30
	A=$((A + 30))
done
aplay '/docs/git/epitome/assets/sound/sound01.wav'
