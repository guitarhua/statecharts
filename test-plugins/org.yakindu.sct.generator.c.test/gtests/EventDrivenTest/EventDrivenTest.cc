/** Generated by YAKINDU Statechart Tools code generator. */

#include "gtest/gtest.h"
#include "EventDriven.h"

#include "sc_timer_service.h"

static EventDriven statechart;


class EventDrivenTest : public ::testing::Test
{
public:
	/* All operations from the SCTUnit test class. */
	void test();
	void setTimer(EventDriven* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic);
	void unsetTimer(EventDriven* handle, const sc_eventid evid);
protected:
	sc_unit_timer_service_t timer_service;
	virtual void SetUp();
};

static EventDrivenTest * tc;


void EventDrivenTest::SetUp()
{
	eventDriven_init(&statechart);
	sc_timer_service_init(
		&timer_service,
		0,
		(sc_run_cycle_fp) &eventDriven_runCycle,
		true,
		200,
		&statechart
	);
	
	
	tc = this;
}
void EventDrivenTest::test()
{
	eventDriven_enter(&statechart);
	EXPECT_TRUE(eventDrivenIface_israised_running(&statechart));
	eventDrivenIface_raise_inEvent(&statechart);
	EXPECT_TRUE(eventDrivenIface_israised_oe1(&statechart));
	EXPECT_TRUE(eventDrivenIface_israised_oe2(&statechart));
	EXPECT_TRUE(eventDrivenIface_israised_oe3(&statechart));
	EXPECT_TRUE(eventDriven_isStateActive(&statechart, EventDriven_main_region_StateD));
	eventDrivenIface_raise_inEventBool(&statechart, true);
	EXPECT_TRUE(eventDriven_isStateActive(&statechart, EventDriven_main_region_StateE));
	EXPECT_TRUE(eventDriven_isStateActive(&statechart, EventDriven_main_region_StateE__region0_State2));
	eventDrivenIface_raise_inEvent(&statechart);
	EXPECT_TRUE(eventDriven_isStateActive(&statechart, EventDriven_main_region_StateF));
	eventDrivenIfaceNamedI_raise_namedInEvent(&statechart);
	EXPECT_TRUE(eventDriven_isFinal(&statechart));
	eventDriven_exit(&statechart);
}

void EventDrivenTest::setTimer(EventDriven* statechart, const sc_eventid evid, const sc_integer time_ms, const sc_boolean periodic){
	sc_timer_t timer;
	sc_timer_init(&timer, time_ms, periodic, evid);
	insert_timer(&(tc->timer_service), timer);
}

void EventDrivenTest::unsetTimer(EventDriven* handle, const sc_eventid evid){
	delete_task(&(tc->timer_service), find_time_event(&timer_service, evid));
}

TEST_F(EventDrivenTest, test) {
	test();
}


