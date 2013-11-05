# AnimationLib

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

To let a player perform a specific animation jusrt do:
```java
PlayerAnimation.SWING_ARM(<player>);
```

This code will make the player swing his arm. The library contains 4 diffrent classes that allow
you to play an animation with; those classes are: PlayerAnimation, BlockAnimation, SoundEffect and WorldAnimation.
The PlayerAnimation class is used to let a player perform a specific animation. The BlockAnimation is used
to make a block appear broken, the SoundEffect can be used to play every sound that is available in minecraft and last but not least the
WorldAnimation can be used to spawn several kinds of particles.

Latest build: [![Build Status](https://travis-ci.org/CaptainBern/AnimationLib.png)](https://travis-ci.org/CaptainBern/AnimationLib) 



