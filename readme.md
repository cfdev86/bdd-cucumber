BDD stands for Behaviour Driven Development, Cucumber is a tool that facilitates BDD.

BDD is an approach that collaboratively specifies the system's desired behaviour. Each time a piece of behaviour is agreed, we use that specification to "drive" the development 
of the code that will implement that behaviour.


What are three practices of BDD, and in what order do you apply them to a story?
We start by collaboratively discovering the scope of the behaviour required by the story. Once we have agreed on that behaviour, we formulate the specification in business-readable language. 
Finally, we automate the formulated specification to verify that the system actually behaves as expected.


Who are the three amigos?
The essential three perspectives required are:
    1. customer / business perspective - usually provided by the Product Owner
    2. development perspective - usually provided by a Developer
    3. test perspective - usually provided by a Tester


Who do we call it "Three Amigos"?
The goal of a three amigos meeting is to ensure that the team fully understand the scope of the story being discussed. For this to be effective, we need to have at least three different 
perspectives represented at the meeting.

1. More than three people might attend a three amigos meeting, because:
2. Some stories are broad enough to require the input of more than three perspectives
3. More than one representative of each perspective may attend


The group discovered a new business rule during the meeting. Why?
The whole purpose of the three amigos meeting is to discover things about the story that weren't previously obvious. We should expect to learn new things during a three amigos meeting.


Why are questions a valuable output from a discovery session?

We want to discover our areas of ignorance before we start developing the next piece of functionality. If we still have unanswered questions about a piece of functionality, it's unlikely 
that we're in a position to start working on it.Before the discovery workshop, the question hadn't been asked. That means it was an unknown unknown - it was something that we were 
completely unaware of. Now that we have asked the question, it is a known unknown - we are aware that it is an area that we need to learn more about.Having discovered the question, the 
team now has a concrete area to investigate, learning more about the problem they're being asked to solve.


What is Gherkin?

Gherkin is a simple syntax that allows teams to write business readable, executable specifications. Some of the Gherkin keywords are Given, When, and Then, but not all text that uses these
words is Gherkin. Gherkin is understood by a large number of tools, notably Cucumber and Specflow, that effectively turn the specification into automated tests.


What’s the relationship between a scenario and an example?

During three amigos the team uses concrete examples to ensure that they have a shared understanding of the functionality they're about to develop. Those concrete examples are formulated into
Gherkin scenarios. So, each scenario is an example. Scenario and Example are both keywords in Gherkin.


Scenario, Given, When, Then?
Scenario just tells Cucumber we’re about to describe an example that it can execute. Then you see the lines beginning with Given, When and Then.
Given is the context for the scenario. We’re putting the system into a specific state, ready for the scenario to unfold.
When is an action. Something that happens to the system that will cause something else to happen: an outcome.
Then is the outcome. It’s the behaviour we expect from the system when this action happens in this context.

Each scenario has these three ingredients: a context, an action, and one or more outcomes.Together, they describe one single aspect of the behaviour of the system. An example.


What’s an advantage of using Gherkin to express our examples in BDD?

Gherkin is just one way of expressing examples of how you want your system to behave. The advantage of using this particular format is that you can use Cucumber to test them for you,
making them into Living Documentation.


What’s an advantage of using Gherkin to express our examples in BDD?
Gherkin is just one way of expressing examples of how you want your system to behave. The advantage of using this particular format is that you can use Cucumber to test them for you, 
making them into Living Documentation.


Each line in a Scenario that begins with one of the Given / When / Then keywords is called a step.

When Cucumber tells us that a step is undefined, that means it doesn't know what we want it to do in order to automate that step. We have to tell Cucumber what to do by
providing step definitions.






