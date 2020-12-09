package com.example.mycoworkers.data;

import com.example.mycoworkers.R;
import java.util.ArrayList;

public class CoWorkersData {
    private static String[] name = {
            "Anna Smith",
            "Benny Maccini",
            "Charlie Dart",
            "Davin Smitten",
            "Ethan Joe",
            "Felice Easley",
            "George",
            "Hilman Ealson",
            "Ian Sacco",
            "Jonathan Liven",
            "Kenneth Scort",
            "Lilian Meccen",
            "Mario Badesco",
            "Novarine Andely",
            "Angelia Widjaja"
    };

    private static String[] workerId = {
            "GMF-00011-HRD",
            "GMF-00021-IT",
            "GMF-00012-HRD",
            "GMF-00031-FAT",
            "GMF-00032-FAT",
            "GMF-00041-MM",
            "GMF-00022-IT",
            "GMF-00042-MM",
            "GMF-00043-MM",
            "GMF-00033-FAT",
            "GMF-00051-IVT",
            "GMF-00023-IT",
            "GMF-00052-IVT",
            "GMF-00024-IT",
            "GMF-00025-IT"
    };

    private static String[] titlePosition = {
            "HR Manager",
            "Chief Technology Officer",
            "Senior HR Staff",
            "FAT Manager",
            "FAT Supervisor",
            "GM Marketing",
            "IT Manager",
            "Marketing Manager",
            "Marketing Staff",
            "FAT Staff",
            "Inventory Staff",
            "Senior Programmer",
            "Chief Executive Officer",
            "Junior Programmer",
            "Junior Programmer"
    };

    private static String[] joinedDate = {
            "12 Mar 1997",
            "20 Jul 1997",
            "05 Dec 2001",
            "11 Jan 1998",
            "24 Jul 1998",
            "28 Feb 1994",
            "18 Nov 1997",
            "02 Mar 1996",
            "25 Apr 1997",
            "07 Jun 1998",
            "11 Jan 1997",
            "16 Feb 2002",
            "24 May 2000",
            "14 Aug 2004",
            "12 Sep 2004"
    };

    private static String[] division = {
            "Human Resources",
            "Information Technology",
            "Human Resources",
            "Finance Accounting Tax",
            "Finance Accounting Tax",
            "Marketing",
            "Information Technology",
            "Marketing",
            "Marketing",
            "Finance Accounting Tax",
            "Inventory",
            "Information Technology",
            "CEO",
            "Information Technology",
            "Information Technology"
    };

    private static String[] phone = {
            "081280029290",
            "082080119470",
            "080589692025",
            "081190659330",
            "081240222111",
            "082542316890",
            "085692134567",
            "080265545433",
            "081112353110",
            "080745026445",
            "081370024483",
            "082188733665",
            "082480119470",
            "081615323317",
            "081289693035",
    };

    private static String[] email = {
            "anna.smith@my-coworkers.com",
            "benny.maccini@my-coworkers.com",
            "charlie.dart@my-coworkers.com",
            "davin.smitten@my-coworkers.com",
            "ethan.joe@my-coworkers.com",
            "felice.easley@my-coworkers.com",
            "george@my-coworkers.com",
            "hilman.ealson@my-coworkers.com",
            "ian.sacco@my-coworkers.com",
            "jonathan.liven@my-coworkers.com",
            "kenneth.scort@my-coworkers.com",
            "lilian@my-coworkers.com",
            "mario.badesco@my-coworkers.com",
            "novarine.andely@my-coworkers.com",
            "angelia.widjaja@my-coworkers.com"
    };

    private static String[] officeLocation = {
            "Main Office, MH Thamrin",
            "Main Office, MH Thamrin",
            "Branch Office, Kebon Jeruk",
            "Main Office, MH Thamrin",
            "Main Office, MH Thamrin",
            "Main Office, MH Thamrin",
            "Main Office, MH Thamrin",
            "Main Office, MH Thamrin",
            "Branch Office, Kebon Jeruk",
            "Main Office, MH Thamrin",
            "Branch Office, Kebon Jeruk",
            "Branch Office, Kebon Jeruk",
            "Main Office, MH Thamrin",
            "Branch Office, Kebon Jeruk",
            "Branch Office, Kebon Jeruk",
    };

    private static int[] floorLocation = {
            5,
            12,
            2,
            7,
            7,
            3,
            10,
            7,
            2,
            7,
            1,
            3,
            12,
            3,
            3
    };

    private static String[] jobRoles = {
            "<ul><li>Develop and implement HR strategies and initiatives aligned with the overall business strategy<br/></li>" +
                    "<li>Bridge management and employee relations by addressing demands, grievances or other issues<br/></li>" +
                    "<li>Manage the recruitment and selection process<br/></li>" +
                    "<li>Support current and future business needs through the development, engagement, motivation and preservation of human capital<br/></li>" +
                    "<li>Develop and monitor overall HR strategies, systems, tactics and procedures across the organization<br/></li>" +
                    "<li>Nurture a positive working environment<br/></li>" +
                    "<li>Oversee and manage a performance appraisal system that drives high performance<br/></li>" +
                    "<li>Maintain pay plan and benefits program<br/></li>" +
                    "<li>Assess training needs to apply and monitor training programs<br/></li>" +
                    "<li>Report to management and provide decision support through HR metrics<br/></li>" +
                    "<li>Ensure legal compliance throughout human resource management</li></ul>",
            "<ul><li>Setting a vision for how technology will be used in the company.<br/></li>" +
                    "<li>Ensuring that the technological resources meet the company's short and long-term needs.<br/></li>" +
                    "<li>Outline the goals for research and development.<br/></li>" +
                    "<li>Creating timelines for the development and deployment of all technological services.<br/></li>" +
                    "<li>Making executive decisions on behalf of the company's technological requirements.<br/></li>" +
                    "<li>Acting as a mentor to team members.<br/></li>" +
                    "<li>Maintaining a consumer-focused outlook and aiding in the delivering of IT projects to market.<br/></li>" +
                    "<li>Managing technology budgets and time frames.<br/></li>" +
                    "<li>Staying on top of technology trends and developments.<br/></li>" +
                    "<li>Ensuring all technology practices adhere to regulatory standards.</li></ul>",
            "<ul><li>Support the development and implementation of HR initiatives and systems<br/></li>" +
                    "<li>Provide counseling on policies and procedures<br/></li>" +
                    "<li>Be actively involved in recruitment by preparing job descriptions, posting ads and managing the hiring process<br/></li>" +
                    "<li>Create and implement effective onboarding plans<br/></li>" +
                    "<li>Develop training and development programs<br/></li>" +
                    "<li>Assist in performance management processes<br/></li>" +
                    "<li>Support the management of disciplinary and grievance issues<br/></li>" +
                    "<li>Maintain employee records (attendance, EEO data etc.) according to policy and legal requirements<br/></li>" +
                    "<li>Review employment and working conditions to ensure legal compliance</li></ul>",
            "<ul><li>Provide financial reports and interpret financial information to managerial staff while recommending further courses of action.<br/></li>" +
                    "<li>Analyze costs, pricing, variable contributions, sales results and the company’s actual performance compared to the business plans.<br/></li>" +
                    "<li>Develop trends and projections for the firm’s finances.<br/></li>" +
                    "<li>Conduct reviews and evaluations for cost-reduction opportunities.<br/></li>" +
                    "<li>Manage the preparation of the company’s budget.<br/></li>" +
                    "<li>Establish and enforce proper accounting methods, policies and principles.<br/></li>" +
                    "<li>Coordinate and complete annual audits.<br/></li>" +
                    "<li>Assign projects and direct staff to ensure compliance and accuracy.<br/></li>" +
                    "<li>Establish and maintain fiscal files and records to document transactions.<br/></li>" +
                    "<li>Deliver a full range of tax services in compliance with laws and regulations within timeframe.<br/></li>" +
                    "<li>Build relationships and interact with clients to provide excellent planning, consulting and expertise.<br/></li>" +
                    "<li>Provide innovative tax planning and review complex income tax returns.<br/></li>" +
                    "<li>Identify and mitigate tax risks.<br/></li>" +
                    "<li>Manage tax provision and tax compliance process.<br/></li>" +
                    "<li>Manage and coordinate tax audits.</li></ul>",
            "<ul><li>Prepare monthly, quarterly and annual financial reports</li>" +
                    "<li>Prepare balance sheets<br/></li>" +
                    "<li>Process invoices<br/></li>" +
                    "<li>Oversee daily transactions, including accounts payable/receivable, general ledger and bank reconciliations<br/></li>" +
                    "<li>Organize financial data into useable information and maintain updated records<br/></li>" +
                    "<li>Organize and update the company’s tax database<br/></li>" +
                    "<li>Prepare necessary paperwork for tax payments and returns<br/></li>" +
                    "<li>Liaise with internal and external auditors<br/></li>" +
                    "<li>Forecast tax predictions to senior managers</li></ul>",
            "<ul><li>Design, implement, and facilitate annual marketing plan for the company.<br/></li>" +
                    "<li>Support and facilitate development and implementation of marketing plans.<br/></li>" +
                    "<li>Plan and administer the company's marketing budget and keep cost in control.<br/></li>" +
                    "<li>Customize materials according to specific market or customer requirements.<br/></li>" +
                    "<li>Develop promotional material and distribution<br/></li>" +
                    "<li>Train the marketing team for prospective client meetings, presentations, etc<br/></li>" +
                    "<li>Responsible for the public relation efforts<br/></li>" +
                    "<li>Connection with external vendors and consultants<br/></li>" +
                    "<li>Make staffing and hiring decisions within marketing department<br/></li>" +
                    "<li>Build and develop a marketing team which is competent, commercially astute, dedicated, and efficient</li></ul>",
            "<ul><li>Manage information technology and computer systems<br/></li>" +
                    "<li>Plan, organize, control and evaluate IT and electronic data operations<br/></li>" +
                    "<li>Manage IT staff by recruiting, training and coaching employees, communicating job expectations and appraising their performance<br/></li>" +
                    "<li>Design, develop, implement and coordinate systems, policies and procedures<br/></li>" +
                    "<li>Ensure security of data, network access and backup systems<br/></li>" +
                    "<li>Act in alignment with user needs and system functionality to contribute to organizational policy<br/></li>" +
                    "<li>Identify problematic areas and implement strategic solutions in time<br/></li>" +
                    "<li>Audit systems and assess their outcomes<br/></li>" +
                    "<li>Preserve assets, information security and control structures<br/></li>" +
                    "<li>Handle annual budget and ensure cost effectiveness</li></ul>",
            "<ul><li>Develop strategies and tactics to get the word out about our company and drive qualified traffic to our front door<br/></li>" +
                    "<li>Deploy successful marketing campaigns and own their implementation from ideation to execution<br/></li>" +
                    "<li>Experiment with a variety of organic and paid acquisition channels like content creation, content curation, pay per click campaigns, event management, publicity, social media, lead generation campaigns, copywriting, performance analysis<br/></li>" +
                    "<li>Produce valuable and engaging content for our website and blog that attracts and converts our target groups\n<br/></li>" +
                    "<li>Build strategic relationships and partner with key industry players, agencies and vendors<br/></li>" +
                    "<li>Prepare and monitor the marketing budget on a quarterly and annual basis and allocate funds wisely<br/></li>" +
                    "<li>Oversee and approve marketing material, from website banners to hard copy brochures and case studies<br/></li>" +
                    "<li>Measure and report on the performance of marketing campaigns, gain insight and assess against goals<br/></li>" +
                    "<li>Analyze consumer behavior and adjust email and advertising campaigns accordingly</li></ul>",
            "<ul><li>Contribute in the implementation of marketing strategies<br/></li>" +
                    "<li>Support the marketing manager in overseeing the department’s operations<br/></li>" +
                    "<li>Organize and attend marketing activities or events to raise brand awareness<br/></li>" +
                    "<li>Plan advertising and promotional campaigns for products or services on a variety of media<br/></li>" +
                    "<li>Liaise with stakeholders and vendors to promote success of activities and enhance the company’s presence<br/></li>" +
                    "<li>See all ventures through to completion and evaluate their success using various metrics<br/></li>" +
                    "<li>Prepare content for the publication of marketing material and oversee distribution<br/></li>" +
                    "<li>Conduct market research to identify opportunities for promotion and growth<br/></li>" +
                    "<li>Collaborate with managers in preparing budgets and monitoring expenses</li></ul>",
            "<ul><li>Assist departments in account reconciliation process on monthly basis.<br/></li>" +
                    "<li>Assisting with research, filing, data entry, and recording and maintaining accurate and complete financial records.<br/></li>" +
                    "<li>Preparing financial reports, such as balance sheets and income statements, invoices, and other documents.<br/></li>" +
                    "<li>Learning how to work as part of the Accounting team to compile and analyze data, track information, and support the company or clients.<br/></li>" +
                    "<li>Taking on additional tasks or projects to learn more about accounting and office operations.</li></ul>",
            "<ul><li>Maintaining and updating records.<br/></li>" +
                    "<li>Counting materials, equipment, merchandise, or supplies in stock.<br/></li>" +
                    "<li>Reporting discrepancies between physical counts and computer records.<br/></li>" +
                    "<li>Developing or improving upon inventory management procedures.<br/></li>" +
                    "<li>Stocking and distributing supplies, equipment or merchandise.<br/></li>" +
                    "<li>Compiling balance, price and cost reports.</li></ul>",
            "<ul><li>Develop high-quality software design and architecture<br/></li>" +
                    "<li>Identify, prioritize and execute tasks in the software development life cycle<br/></li>" +
                    "<li>Develop tools and applications by producing clean, efficient code<br/></li>" +
                    "<li>Automate tasks through appropriate tools and scripting<br/></li>" +
                    "<li>Review and debug code<br/></li>" +
                    "<li>Perform validation and verification testing<br/></li>" +
                    "<li>Collaborate with internal teams and vendors to fix and improve products<br/></li>" +
                    "<li>Document development phases and monitor systems<br/></li>" +
                    "<li>Ensure software is up-to-date with latest technologies</li></ul>",
            "<ul><li>Develop high quality business strategies and plans ensuring their alignment with short-term and long-term objectives<br/></li>" +
                    "<li>Lead and motivate subordinates to advance employee engagement develop a high performing managerial team<br/></li>" +
                    "<li>Oversee all operations and business activities to ensure they produce the desired results and are consistent with the overall strategy and mission<br/></li>" +
                    "<li>Make high-quality investing decisions to advance the business and increase profits<br/></li>" +
                    "<li>Enforce adherence to legal guidelines and in-house policies to maintain the company’s legality and business ethics<br/></li>" +
                    "<li>Review financial and non-financial reports to devise solutions or improvements<br/></li>" +
                    "<li>Build trust relations with key partners and stakeholders and act as a point of contact for important shareholders<br/></li>" +
                    "<li>Analyze problematic situations and occurrences and provide solutions to ensure company survival and growth<br/></li>" +
                    "<li>Maintain a deep knowledge of the markets and industry of the company</li></ul>",
            "<ul><li>Assisting the Development Manager with all aspects of software design and coding.<br/></li>" +
                    "<li>Attending and contributing to company development meetings.<br/></li>" +
                    "<li>Learning the codebase and improving your coding skills.<br/></li>" +
                    "<li>Writing and maintaining code.<br/></li>" +
                    "<li>Working on minor bug fixes.<br/></li>" +
                    "<li>Monitoring the technical performance of internal systems.<br/></li>" +
                    "<li>Responding to requests from the development team.<br/></li>" +
                    "<li>Gathering information from consumers about program functionality.<br/></li>" +
                    "<li>Writing reports.<br/></li>" +
                    "<li>Conducting development tests.</li></ul>",
            "<ul><li>Assisting the Development Manager with all aspects of software design and coding.<br/></li>" +
                    "<li>Attending and contributing to company development meetings.<br/></li>" +
                    "<li>Learning the codebase and improving your coding skills.<br/></li>" +
                    "<li>Writing and maintaining code.<br/></li>" +
                    "<li>Working on minor bug fixes.<br/></li>" +
                    "<li>Monitoring the technical performance of internal systems.<br/></li>" +
                    "<li>Responding to requests from the development team.<br/></li>" +
                    "<li>Gathering information from consumers about program functionality.<br/></li>" +
                    "<li>Writing reports.<br/></li>" +
                    "<li>Conducting development tests.</li></ul>"
    };

    private static String[] jobSource = {
            "https://resources.workable.com/hr-manager-job-description",
            "https://www.betterteam.com/cto-job-description",
            "https://resources.workable.com/hr-officer-job-description",
            "https://resources.workable.com/financial-manager-job-description, https://resources.workable.com/accounting-manager-job-description, https://resources.workable.com/tax-manager-job-description",
            "https://resources.workable.com/accounting-supervisor-job-description, https://resources.workable.com/tax-accountant-job-description, https://resources.workable.com/finance-officer-job-description",
            "https://www.scribd.com/doc/47206512/Marketing-GM-Job-description",
            "https://resources.workable.com/it-manager-job-description",
            "https://resources.workable.com/marketing-manager-job-description",
            "https://resources.workable.com/marketing-officer-job-description",
            "https://www.betterteam.com/accounting-intern-job-description",
            "https://www.betterteam.com/inventory-clerk-job-description",
            "https://resources.workable.com/senior-software-engineer-job-description",
            "https://resources.workable.com/ceo-job-description",
            "https://www.betterteam.com/junior-software-developer-job-description",
            "https://www.betterteam.com/junior-software-developer-job-description"
    };

    private static int[] workerPhoto = {
            R.drawable.anna_smith,
            R.drawable.benny_maccini,
            R.drawable.charlie_dart,
            R.drawable.davin_smitten,
            R.drawable.ethan_joe,
            R.drawable.felice_easley,
            R.drawable.george,
            R.drawable.hilman_ealson,
            R.drawable.ian_sacco,
            R.drawable.jonathan_liven,
            R.drawable.kenneth_scort,
            R.drawable.lilian_meccen,
            R.drawable.mario_badesco,
            R.drawable.novarine_andely,
            R.drawable.angelia_widjaja
    };

    private static String[] photoSource = {
            "https://www.freepik.com/free-photo/secretary-holding-pen_865260.htm",
            "https://www.freepik.com/free-photo/smiley-man-with-tablet-showing-approval_5236631.htm",
            "https://www.freepik.com/free-photo/elegant-businessman-office_8679600.htm",
            "https://www.freepik.com/free-photo/handsome-business-man-working-computer-office_8827980.htm",
            "https://www.freepik.com/free-photo/concentrated-asian-office-worker-earphones-reading-documents-workplace-indoor-portrait-chinese-freelance-it-specialist-drinks-coffee-while-using-with-laptop_10483946.htm",
            "https://www.freepik.com/free-photo/pleased-female-secretary-trendy-glasses-posing-office-after-meeting-with-colleagues-indoor-portrait-stylish-businesswoman-with-asian-african-workers_10483958.htm",
            "https://www.freepik.com/free-photo/confident-businessman-working-his-laptop_10113348.htm",
            "https://www.freepik.com/free-photo/ethnic-female-employee-with-glasses-working-laptop_4821898.htm",
            "https://www.freepik.com/free-photo/student-working-laptop_6806307.htm",
            "https://www.freepik.com/free-photo/portrait-successful-handsome-executive-businessman-smart-casual-wear-looking-camera-smiling-arms-crossed-modern-office-workplace-young-asia-guy-standing-contemporary-meeting-room_7696865.htm",
            "https://www.freepik.com/free-photo/happy-asian-man-standing-with-arms-crossed-grey-wall_7440380.htm",
            "https://www.freepik.com/free-photo/portrait-young-pretty-smiling-woman-sitting-table-black-shirt-working-laptop-co-working-office-wearing-glasses_9405590.htm",
            "https://www.freepik.com/free-photo/cheerful-young-caucasian-businessman_6514541.htm",
            "https://www.freepik.com/free-photo/female-male-collegues-working-office_6190358.htm",
            "-"
    };

    public static ArrayList<CoWorker> getCoWorkersData(){
        ArrayList<CoWorker> list = new ArrayList<>();
        for(int pos = 0; pos < name.length; pos++){
            CoWorker coWorker = new CoWorker();
            coWorker.setWorkerId(workerId[pos]);
            coWorker.setWorkerPhoto(workerPhoto[pos]);
            coWorker.setPhotoSource(photoSource[pos]);
            coWorker.setName(name[pos]);
            coWorker.setTitlePosition(titlePosition[pos]);
            coWorker.setDivision(division[pos]);
            coWorker.setJoinedDate(joinedDate[pos]);
            coWorker.setPhone(phone[pos]);
            coWorker.setEmail(email[pos]);
            coWorker.setOfficeLocation(officeLocation[pos]);
            coWorker.setFloorLocation(String.valueOf(floorLocation[pos]));
            coWorker.setJobRoles(jobRoles[pos]);
            coWorker.setJobSource(jobSource[pos]);
            list.add(coWorker);
        }
        return list;
    }
}
