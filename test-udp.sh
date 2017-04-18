#!/bin/bash

#def_host=10.11.0.30
def_host=localhost
def_port=$PORT

HOST=${2:-$def_host}
PORT=${3:-$def_port}

while true; do
echo -n "$1" | nc -4u -w1 $HOST $PORT
done

