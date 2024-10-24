create table if not exists pan_asia_trading_credit(
country_code varchar(255) not null,
credit_flow_code varchar(255) null,
origin varchar(255) null,
pre_trade_controls varchar(255) null,
model_partition_type char null,
risk_rating_system Integer null,
business_line_awareness char null,
trading_desk_code varchar(255) null,
creation_date varchar(255) null,
modified_date varchar(255) null,
entity_state varchar(255) null,
constraint pan_asia_trading_credit_pk primary key(country_code));