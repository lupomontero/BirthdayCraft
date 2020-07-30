# BirthdayCraft

![Java CI with Gradle](https://github.com/lupomontero/BirthdayCraft/workflows/Java%20CI%20with%20Gradle/badge.svg)

BirthdayCraft is a _mod_ for Minecraft Java designed to help you organise your
birthday party inside of Minecraft!

This _mod_ was originally designed by
[_Ale & Lupo_](https://www.youtube.com/channel/UCJlal2M8WXdRaVkAlGtHUOQ) for
Alejandro's 8th birthday ;-)

## Installation

* Install Minecraft Java Edition
* Install JDK (Java Developers Kit)
* Install Minecraft Forge
* Create Forge installation within Minecraft Launcher if necessary
* Install BirthdayCraft mod

### Install Minecraft Java Edition

This _mod_ is designed for [Minecraft Java Edition](https://www.minecraft.net/es-es/store/minecraft-java-edition/), which can be installed on Windows, MacOS and Linux.
If you don't already have it, you can buy it [here](https://www.minecraft.net/es-es/store/minecraft-java-edition/)
(26,95 US$). After buying and downloading, you should end up with
_Minecraft Launcher_ installed.

![image](https://user-images.githubusercontent.com/110297/88958435-1213b500-d266-11ea-99f7-44384ebef630.png)

### Install JDK (Java Developers Kit)

Before we can install Minecraft Forge and finally add mods, we need to have
the Java Developers Kit (JDK) installed on our computer. There are many
different distributions. I personally recommend downloading and installing
OpenJDK 8 from the [AdoptOpenJDK](https://adoptopenjdk.net/).

![image](https://user-images.githubusercontent.com/110297/88957166-17700000-d264-11ea-8af4-41eb549e8185.png)

### Install Minecraft Forge

Once you have the _Minecraft Launcher_ installed on your computer (from previuos
step), you will also need to
[download and install Minecraft Forge](https://files.minecraftforge.net/).
This will allow you to install and run other _mods_, like BirthdayCraft.

The current version of BirthdayCraft is `1.15.2-1.0.0`, which basically means
that it is meant to be run with Minecraft Forge `1.15.2` (ideally
`1.15.2-31.2.0`, which is currently the _recommended_ download on the
[official Forge page](https://files.minecraftforge.net/)). Make sure you
download the _installer_ package.

![image](https://user-images.githubusercontent.com/110297/88875671-4ac07980-d1e7-11ea-95e4-2df71c016d40.png)

After downloading you should have a file called something like
`forge-1.15.2-31.2.0-installer.jar`. Double-click on the file to _run_ it. If
that doesn't work, please try making the file executable by adding the relevant
permissions (this will depend on your system). When the forge installer is run
you should see something like this:

![image](https://user-images.githubusercontent.com/110297/88876226-6ed08a80-d1e8-11ea-9155-3bea4caaea7a.png)

Choose the option to _Install client_ in the default location, click OK and wait
for the installation to finish. Take note of the folder where Minecraft files
are stored. This will vary depending on your system:

* **Windows**: Press `Win+R`, then type `%appdata%\.minecraft`, then press Ok.
* **OS X**: In the Finder, from the Go menu, select 'Go to Folder', then type:
  `~/Library/Application Support/minecraft`, and click Go.
* **Linux**: `~` is your home directory, usually `/home/YOURNAME`, so
  `~/.minecraft` would be `/home/YOURNAME/.minecraft/`.

### Create Forge installation within Minecraft Launcher if necessary

Now open your _Minecraft Launcher_ and you should see a new _installation_ for
Minecraft Forge.

![image](https://user-images.githubusercontent.com/110297/88874787-88bc9e00-d1e5-11ea-8164-eb1402994bae.png)

If the Forge installer did not already add a _forge_ installation in your
Minecraft Launcher, you can always create a new one using the launcher's
interface.

![image](https://user-images.githubusercontent.com/110297/88874499-d2f14f80-d1e4-11ea-8c0a-13376bc4f7cc.png)

### Install BirthdayCraft mod

Finally [download the mod](https://github.com/lupomontero/BirthdayCraft/releases/download/v1.15.2-1.0.0/birthdaycraft-1.15.2-1.0.0.jar)
and move the downloaded `.jar` file to your Minecraft `mods` folder. You can
find your `mods` folder inside the folder that we mentioned in when installing
the Forge:

* **Windows**: `%appdata%\.minecraft\mods`.
* **OS X**: `~/Library/Application Support/minecraft/mods`.
* **Linux**: `~/.minecraft/mods`.

After doing this make sure to close and reopen Minecraft if it was already
runnng.

## Usage

Finally, now that we have a Forge installation and mod in the right place, you
should be able to _launch_ the `1.15.2-forge-31.2.0` installation (make sure you
select the forge installation next to the green _play_ button).

![image](https://user-images.githubusercontent.com/110297/88874940-d9cc9200-d1e5-11ea-9533-1bac24b5a1ae.png)

The forge installation should now include a _Mods_ button. Click on it to see
what mods are currently installed.

![image](https://user-images.githubusercontent.com/110297/88958618-5c953180-d266-11ea-8f3c-53f1aec0276a.png)

You should see the _BirthdayCraft_ mod listed along with Minecraft itself and
the forge installation.

![image](https://user-images.githubusercontent.com/110297/88958908-c1e92280-d266-11ea-8742-e073d3362c5c.png)

Create a new world in creative mode and access the _inventory_ using the `e`
key. You should now see the _BirthdayCraft Creative Tab_, with all the custom
blocks, items, tools, armour, etc.

![image](https://user-images.githubusercontent.com/110297/88959208-3f149780-d267-11ea-83c6-b441aa3796df.png)


Enjoy!