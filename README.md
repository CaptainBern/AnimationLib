AnimationLib
============

This is a little library for Bukkit.
It allows developers to easily play animations/particles, since everything is done
trough reflection you don't have to worry about updates anymore.

The library contains a packet util which allows you to easily craft and send packets.
Let's say there is an animation or packet you want to send but it's not included in the lib, then just
create it yourself! Here is how:

```
Packet packet = new Packet("PacketClassHere");
packet.setPrivateValue("field", Object_value); //sets a private field value
packet.setPublicValue("field", Object_value); //set a public field value
packet.send(Player); //sends the packet to specified player
```

Latest build: [![Build Status](https://travis-ci.org/CaptainBern/AnimationLib.png)](https://travis-ci.org/CaptainBern/AnimationLib) 



