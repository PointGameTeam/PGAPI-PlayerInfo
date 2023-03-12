<div align="center">
    <h1>PGAPI-PlayerInfo</h1>
    <a href="./README.MD">[中文文档]</a>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp<a href="./README_EN.MD">[English Doc]</a>
    <p>PointGame 我的世界小游戏服务器，玩家信息管理插件 API，由 Xiaoyi311 独立开发，供 PointGame 服务器使用，代码可供任何人学习</p>
    <p>由 <a href="https://pointgame.top">PointGameTeam</a> 倾心制作</p>
    <a><img src="https://img.shields.io/badge/build-passing-brightgreen" alt="build passing"></a>
    <a href="https://github.com/PointGameTeam/PGAPI-PlayerInfo/releases/" target="_blank"><img src="https://img.shields.io/github/v/release/PointGameTeam/PGAPI-PlayerInfo?include_prereleases" alt="newest version"></a>
</div>

---

## 什么是 PointGame?
PointGame 是一个 Minecraft 小游戏服务器，由 Xiaoyi311 提出并编写，所有插件（除权限等基础插件）均为 Xiaoyi311 编写，服务器所用核心为修改版，并非原版

## 这个项目是什么?
PGAPI-PlayerInfo 为 PointGamePlayerInfo 的对外 API 可以使用此 API 来对 PointGamePlayerInfo 进行控制，使用 MCBukkit 注册 API，为玩家信息管理的 API

## 开发环境
- JDK 8
- Intellij IDEA

## 项目结构
```
├src
  └─io.xiaoyi311.pointgame.playerinfoapi
          Contact —— 社交平台
          IPlayerInfoManager —— 玩家信息管理接口
          PlayerIdentity —— 玩家身份
          PlayerInfo —— 玩家信息
          Rank —— Rank 等级
```

## 配置文件
无

## 如何使用
此项目为 API 项目，仅供开发者使用，用户请前往 PointGamePlayerInfo 仓库下载使用

## 支持
如果在使用过程中遇到任何问题（如漏洞、性能问题），欢迎使用 Issues 向我们反馈，我们会及时修复 

## 开源协议
GNU General Public License v3.0 (GPL v3.0)

