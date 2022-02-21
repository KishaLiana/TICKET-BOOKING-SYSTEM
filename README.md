# TICKET-BOOKING-SYSTEM

# The History of Software
Software refers to the interface between users and computer systems (hardware). It comprises of the programming instructions and data that tell the computer hardware how to perform various tasks.

The first software known as the SSEM (Small Scale Experimental Machine) was written in 1948. this was followed by tShe different computing eras like The Personal Computing Era in the 70s and 80s, and the Mobile device Era in the 90s.

Computing has seen a great deal of technological progress. The hardware upgrades would be meaningless without the birth and growth of software development. Ever other time you use a computer, you interact with software, from operating systems and spreadsheets to mobile apps and games.

# Software #
**refers to the set of instructions in the form of programs that command the computer system and process the hardware components. These instructions can be used to create a software product following the software process.**

The Software Process Models can collectively be defined as an extrapolation from the overall process being described. It is a simplified representation of a software process with every model representing the process from a specific perspective. Software Process Models include the following:
1.	The Workflow Model which refers to the ordered series of tasks and decisions that make up a business process or in this case the software development process.
2.	The Role/Action Model (RAM) is a type of software process model that depicts the roles of individuals involved in the process and specifies the activities of each delegate.
3.	The Data Flow Model: A diagrammatic enactment of the flow and exchange of data collected and information within the system.
4.	The Waterfall Model, also sequential in nature, is a design process model in which progression is illustrated as flowing steadily downward. 

**The waterfall model involves the following phases:**
i.	Requirements Specification  
ii.	System Design
iii.	Impementation
iv.	Testing.

The waterfall model is a software engineering model of two types i.e. The Classical Waterfall Model and the Iterative waterfall model
o	The classical waterfall model is simple but idealistic and is the most popular software model as other models are based off it. This software process model divides the software lifecycle into a set of consecutive phases as described in the image below: INSERT IMG TAG

# Advantages of the classical waterfall model
- it’s simple and easy to understand
- phases of the classical waterfall model are processed one at a time.
- every stage is clearly defined
- processes and activities are well documented
- uses a clear milestone structure which improves productivity.

# Disadvantages of the classical waterfall model.
- no feedback path as it assumes that no errors occur at previous stages
- with this model, it difficult to contain change requests since there is an assumption that all consumer requirements are constant which is an impossible construct in real life because customers usually change as the project progresses
- no overlapping of phases is time consuming and ultimately the project takes longer to complete.

o	The Iterative Waterfall Model incorporates the necessary changes that improve the classical waterfall model. It provides feedback paths from each phase to its preceding phases. 

Insert IMG tag

# Advantages of the Iterative Waterfall Model
- the iterative model offers a feedback mechanism from each phase allowing the developers to correct errors during the development process and these errors are shown in the latter phases.
- this model is simple and thus eases use.
- the iterative model is cost-effective especially when making changes to the plan or requirements.
- this model is coordinated and organized and therefore less time is consumed during documentation and design.

# Disadvantages of the Iterative Waterfall Model
- Risk handling is not supported
- Limits interaction with customers
- Incremental delivery of a minimum viable product is not supported

5.	The Evolutionary development Model follows the activities:
•	Specification
•	Development
•	Validation

6.	The Agile Development Model refers to a group of development processes which share characteristics but have some understated differences among themselves. Examples of SDLC Agile models include: Crystal, A tern, Feature-driven development, Scrum, Lean Development, Unified Process and Extreme Programming (XP).
In this model, the requirements are itemized into small parts which are incrementally developed following the SDLC and it adopts iterative development. The steps include:
•	Requirement gathering
•	Requirement analysis
•	Design
•	Coding
•	Unit testing
•	Acceptance testing

# Advantages of the Agile model
- When compared to programmers working alone, pair programming produces well-written, compact programs with fewer errors.
- After each iteration, customer service personnel get an understanding of upgraded software products. As a result, he can easily adjust any need if necessary.
- this model minimizes the overall development time of the project.

# Disadvantages of the Agile model
- When the project is completed and the developers are assigned to another project, maintenance of the established project may become an issue due to a lack of sufficient documentation.
- Due to the sheer lack of formal records, there is misunderstanding, and crucial decisions made during various phases can be misconstrued at any point by different team members.


# REQUIREMENT SPECIFICATIONS.
**A Requirement** is a constraint/property which must be provided by the system to fulfill the system’s and intended user’s needs.

# Functional Requirements: 
•	The System must be user friendly with clear and unambiguous Graphical User Interface (GUI) which can be navigated and explored with ease.
•	The System must allow users to sign up and create user accounts.
•	The system shall allow the customer to view a detailed description of the movies/blockbusters screening at the time with the screening times and cinema hall numbers as well as number of seats available
•	The system must notify accounts of made payments
•	The system must notify the customer of complete transaction/ payment
•	The system should allow the manager to log in to the system using their username and password. 	 
•	The system should allow employees to log in to the system using their username and password.
•	The system shall allow the manager to create a new user account.
•	The system shall allow the manager to change the account password
•	The system shall allow staff to change the account password.

**External Interface Requirements:**

**User interface**
The system contains the following user interfaces:
●	Login page for authenticating registered users. This screen should accept user email, password and authenticate against registered with information. It also provides features for new user registration and forgot passwords.
●	Screening Movies/Blockbusters search page where registered users can search products based on product attributes. User can search by Movie name, brief description, and Movie Genre/category and Movie id. Search should support intuitive features such as type-ahead, synonym support, categorized results grouping and spell correction.
●	Search results page displays the results of search operation. The results should be paginated with configurable page size.

**Hardware interface**
The System must run over the internet, all the hardware shall be required to connect to the internet, computer, phone or tablet.

**Software and communication interface**
The system is hosted on a server so it requires a scripting language like PHP, etc. The system requires a database to store any transaction made on the system like MYSQL etc.
The system also requires a domain name space for identification on the internet, the system shall use the HTTP protocol for communication over the internet and a web browser through which a user can be able to access the system.

# Non-functional Requirements:

**Performance Requirements**
Performance should be Optimal because server queries involve small pieces of data. Changing screens will require very little computation and thus will occur very quickly. Server updates should only take a few seconds as long as the phone can maintain a steady signal.

**Safety Requirements**
The system will not affect data stored outside of its servers nor will it affect any other applications installed on the user’s phone. It cannot cause any damage to the phone or its internal components. The only potential safety concern associated with this application applies to virtually all handset apps: E-payment system should not be used while operating a vehicle or in any other situation where the user’s attention must be focused elsewhere.

**Security Requirements**
This application assumes that only the user or whoever is allowed will have access to the phone. a Google email address is required to verify the identity of the user upon opening the app and a password to authenticate the user’s identity’s transaction must be authorized and confirmed before becoming final. To ensure that no fraudulent transactions occur.

**Software Quality Requirements**
The graphical user interface of the System is to be designed with usability as the priority. The app will be presented and organized in a manner that is both visually appealing and easy for the user to navigate. There will be feedback and visual cues such as notifications to inform users of updates and pop-ups to provide users with instructions.
To ensure reliability and correctness, there will be zero tolerance for errors in the algorithm that computes and splits expenses between group members. 
To maintain flexibility and adaptability, the app will take into account situations in which a user loses internet connection or for whatever reason cannot establish a connection with the server. These users will still be able to use the application, but any transactions posted while disconnected will be cached until the connection is restored.
The system is to be used on all platforms; thus, the software application has the advantage of being portable and convenient to use whenever and wherever. Overall, the app balances both the ease of use and the ease of learning.

**Maintainable:**
Each of the modules should be designed in such a way that a new module can easily be integrated with it, that is to say, the time required for a solution or its component to be fixed, changed to increase performance or other qualities, or adapted to a changing environment.

**Scalability:**
The system can handle the highest workloads under which the system will still meet the performance requirements.

**Reliability and Availability**
The system will be able to run without a failure for a given period under predefined conditions: that is services such as monitoring the availability of the origin infrastructure and rerouting requests when the origin is not available are put in place.

