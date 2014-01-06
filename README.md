# AnimationLib
Latest build: [![Build Status](https://travis-ci.org/CaptainBern/AnimationLib.png)](https://travis-ci.org/CaptainBern/AnimationLib)
## What is it?
AnimationLib is a small and easy to use animation/sound/effect library for bukkit.
It allows developers to let players easily perform some animations. They can also use it
to play sounds (All sounds that exist in Minecraft can be played with this) or show particles,
or let's say; make a block appear broken.

## Why would I use this instead of LibXYZ?
I do not know of any lib that can do this without you, the user, having to mess around
with nms or packets. You should ask yourself why you wouldn't use this lib.

## How does it work?
The AnimationLib uses a smart reflection framework (based off the reflection framework
found in BKCommonLib). The lib never uses any nms code, thanks to the reflection system and
the smart protocol framework.

## Cool! How do I use it?
Easy! the library was designed to be as lightweight as possible.

To let a player perform a specific animation just do:
```java
PlayerAnimation.SWING_ARM.play(<player>);
```

This code will make the player swing his arm. The library contains 4 diffrent classes that allow
you to play an animation with; those classes are: PlayerAnimation, BlockAnimation, SoundEffect and WorldAnimation.
The PlayerAnimation class is used to let a player perform a specific animation. The BlockAnimation is used
to make a block appear broken, the SoundEffect can be used to play every sound that is available in minecraft and last but not least the
WorldAnimation can be used to spawn several kinds of particles.

## Sending packets yourself.
The library contains a Reflection (based off the BKCommonLib) and Protocol framework. The reflection framework makes it
possible for the library to be version independent.

The reflection framework can be used to create NMS or CB Class templates/Instances.
To create a NMS-Class template you can just do:
```java
ClassTemplate template = NMSClassTemplate.create(<Class type or Class name>);

//and to create a CB Class template:
ClassTemplate template = CBClassTemplate.create(<Class type or Class name>);
```

Then you can create a new instance of your template by doing:
```java
Object instance = template.newInstance();
```
And then you can invoke methods and fields however you want.

The protocol framework is easier to use. It only allows you to send packets tho, if you also
want to listen for incoming or outgoing packets then you should get ProtocolLib.

If you want to use my protocol framework then you can just do:
```java
Packet packet = new Packet(PacketType.<Protocol Type>.<Sender>.<Type>);

//to set fields in the packet you can use:
packet.write(index, value);
//or
packet.write("fieldname", value);
/* you can also write to a field using a FieldAccessor.
   You can create a FieldAccessor by doing:
*/
FieldAccessor<FIELD_TYPE> field = new SafeField<FIELD_TYPE>(Class<?> type, "fieldname");
//and then you can do:
packet.write(field, value);
```

If you have any questions feel free to pm me on http://forums.bukkit.org/  @ CaptainBern





