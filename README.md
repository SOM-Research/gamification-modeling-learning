## A model-based framework to learn modeling through Gamification

The framework is composed of two components, *Game Settings* and *Gamification Environment*. They are described below.

### Game settings
The game settings leverage on Xtext and is composed of the following plugins: 
* codeskills.designer.data.*, which support the definition of the project data abstraction metamodel
* codeskills.designer.game*, which contain the DSL used to define games
* codeskills.designer.game.status.*, which support the definition of the game status metamodel

### Gamification environment
The gamification environment is represented by the plugin *codeskills.enduser*, details of its folders are described below.
* img/. It contains default badges, notification images and icons used by the plugin.
* queries/. It contains the file embedding the OCL queries used to check the achievements of the user. The file relies on *Eclipse Complete OCL* and by default its name is *queries.ocl*".
* resources/. It contains the instance of the game DSL, by default its name is *settings.game*.
* sound/. It contains default sounds used to notify the user (e.g., achievement, group and level completed).
* src/. It contains the source code, which is organized in packages. The entry points of the Eclipse plugin are located in *codeskills.handlers*,
they receive the user input. 

#### Customization & Extension

- The default settings of the plugin (name of images, queries, etc.) can be changed by modifying the class **codeskills/resource/ResourceManager.java**.


- In order to extend the tool to cope with other models beyond SQL and UML, the user should extend the class **codeskills/game/ProjectManager.java**, and in particular
the method:

```java
createFile(ContainerResource parent, String name, String extension, boolean modified)
```
