# Head First Java - Sink a Startup Game

## Overview

This repo contains my flavor of the implementation of the Sink-a-Startup Game from the Head First Java book

## Chart
```mermaid
---
config:
  theme: 'dark'
---
flowchart TD
    bustcls[StartupBust Class]
    bustobj((StartupBust Object))
    gamehobj((Game Helper))
    arrlstobj1((ArrayList Object))
    startupobj((Startup Object))
    arrlstobj2((ArrayList Object))
    bustcls -- instantiates --> bustobj
    bustobj -- instantiates --> gamehobj & arrlstobj1
    arrlstobj1 -- contains 3 -->  startupobj
    startupobj -- contains --> arrlstobj2
    bustobj -- make locations/user guess --> gamehobj -- here it is --> bustobj
    arrlstobj1 -- check guess --> startupobj -- miss/hit/kill --> arrlstobj1
```