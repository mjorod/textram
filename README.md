# Getting Started #

To get your IDE set up, the code and run TextRAM the first time, please follow **all** of these instructions.

## Installing Java JDK ##

It is highly recommended that you use the Java JDK. The Java Runtime Environment is not enough. The JDK contains documentation and the Java source, which will help you when developing and debugging.

1. Install the Java JDK if you don't have it installed yet. You can get it from [Oracle](http://www.oracle.com/technetwork/java/javase/downloads/index.html).
    * **Mac OS X**: As of right now, TextRAM doesn't run on Java 7 (provided by Oracle). Go to [Apple Developer](https://developer.apple.com/downloads/index.action) and download the latest *Java for OS X [...] Developer Package*. You need an Apple ID (free) for that.

## Installing Eclipse ##

While you may use your existing Eclipse installation, it is
recommended to start off with the *Pre-configured Eclipse with Xtext*
[Xtext pre-configured](https://www.eclipse.org/Xtext/download.html). If you feel comfortable enough, you can add these to your existing installation.

1. Choose Help -> Install New Software... from the menu bar and
   Add... Insert the adequate URL from [Xtext](http://download.eclipse.org/modeling/tmf/xtext/updates/composite/releases/). This site
   aggregates all the necessary and optional components and
   dependencies of Xtext.
2. Select the Xtext SDK from the category Xtext {version} and complete
   the wizard by clicking the Next button until you can click Finish.
3. After a quick download and a restart of Eclipse, Xtext is ready to
   use.

*Note:* Xtext relies on the Antlr generator library. Xtext will try to download it on demand. To avoid this, you can manually install the feature Xtext Antlr-2.0.0 from the itemis update site ( http://download.itemis.de/updates/).

## Installing required plug-ins and setting up ##

The following plug-ins are required to be installed. Eclipse gets already shipped with Git support ([EGit](https://www.eclipse.org/egit/))

### OCL Samples and Editors ###

The metamodel of RAM makes use of OCL for derivation, operation bodies and constraints.

1. Go to *Help* > *Install New Software*.
1. Select the release update site of the current Eclipse version (e.g., *Kepler - [...]* for Eclipse Kepler).
1. Choose *OCL Samples and Editors* from the *Modeling* category.
1. Follow the instructions.

That's it. Now you can now configure Git before you get the code.

## Configure Git ##

The code is maintained using the distributed version control system [Git](http://git-scm.com/). You can either use your local Git client or Eclipse, which by default has Git support ([EGit](http://www.eclipse.org/egit/)). We recommend using Eclipse.

Now you can get the code.

## Get the Code ##

GitHub [repository](https://github.com/mjorod/textram) provides you with the repository URL when you select *Clone* on the repository.

### Using Eclipse ###

1. Open the *Git Repository Exploring* perspective.
1. [Clone the repository](http://wiki.eclipse.org/EGit/User_Guide#Cloning_a_Repository).
1. [Import projects](http://wiki.eclipse.org/EGit/User_Guide#Importing_projects) from the cloned repository.

### Using the command-line###

1. [Clone the repository](http://git-scm.com/book/en/Git-Basics-Getting-a-Git-Repository#Cloning-an-Existing-Repository) to a local location of your choice.
1. Import the projects into your workspace in Eclipse.

Once that is done you can run TextRAM.

## Run TextRAM ##

1. You must make sure that the launch configuration has enough PermGen
size. You need to specify this VM argument in your launch configuration: -XX:MaxPermSize=256m

2. In order to run TextRAM,  right-click on the project
*cl.uchile.pleiad.textram* and navigate to Run As | Run As
Configurations...; in the dialog you will see *Launch Runtime Eclipse*
under Eclipse Application; Select that and click **Run**.

3. A new Eclipse instance will be run and a new workbench will
   appear. Let's create a new General project and create a new file
   with the name of the aspect that you want to model. **The extension of
   the file must be .xram**.  As soon as the file is created it will
   also be opened in a text editor and you will be asked to add the
   Xtext nature to your project. You should accept that to make your
   TextRAM editor work correctly in Eclipse.

4. All RAM's models will be generated inside the folder: *src-gen/aspects/*
