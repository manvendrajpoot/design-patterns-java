## Complex Video Converter Application

Video processing is notoriously complex. To convert a video, a system must read the file, extract the video and audio streams (demuxing), decode them using the correct codecs, apply any compression or bitrates, encode them into the new format, and finally package them back together (muxing).

If we expose this raw logic to the client app (like a UI button), the client becomes tightly coupled to a dozen internal video processing classes. We use a Facade to hide this nightmare behind a simple convertVideo(filename, format) method.

### Step 1: Clarify the Requirements & Constraints
State your assumptions to the interviewer:

#### The Subsystems: 
We are relying on a complex, low-level framework (like FFmpeg internals). It has separate classes for reading, codecs, audio mixing, and bitrates.

#### The Problem: 
The client application just wants to convert an mp4 to an ogg file. It shouldn't need to understand what "Muxing" or "Bitrate reading" is.

#### The Goal: 
Provide a clean, unified VideoConverter wrapper that orchestrates the heavy lifting.

### Step 2: Define the Architecture (Facade Pattern)
Explain the roles of the classes to the interviewer:

#### The Complex Subsystem: 
VideoFile, CodecFactory, MPEG4CompressionCodec, OggCompressionCodec, BitrateReader, AudioMixer. (These are the messy internal classes).

#### The Facade: 
VideoConverter. It provides a single method that orchestrates the subsystem classes in the correct order.

#### The Client: 
Main application. It only talks to VideoConverte