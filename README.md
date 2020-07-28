# BirthdayCraft

```sh
sudo docker pull itzg/minecraft-server
sudo docker run -d \
  -v /home/lupo/work/lupomontero/BirthdayCraft/server:/data \
  -e TYPE=FORGE \
  -e FORGEVERSION=31.2.0 \
  -e VERSION=1.15.2 \
  -e DIFFICULTY=peaceful \
  -e OPS=lupomontero \
  -e ALLOW_NETHER=true \
  -e ANNOUNCE_PLAYER_ACHIEVEMENTS=true \
  -e ENABLE_COMMAND_BLOCK=true \
  -e FORCE_GAMEMODE=false \
  -e EULA=TRUE \
  -p 25565:25565 \
  --name mc \
  itzg/minecraft-server
```